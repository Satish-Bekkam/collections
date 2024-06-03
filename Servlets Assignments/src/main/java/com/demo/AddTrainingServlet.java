package com.demo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addTrain")
public class AddTrainingServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlineTraining";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345678";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String trainingId = request.getParameter("trainingId");
        String trainingName = request.getParameter("trainingName");
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        String trainingMode = request.getParameter("trainingMode");
        String businessUnit = request.getParameter("businessUnit");
        String contactPersonId = request.getParameter("contactPersonId");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            String insertQuery = "INSERT INTO Training (TrainingID, TrainingName, StartDate, EndDate, TrainingMode, BusinessUnit, ContactPersonID) " +
                                 "VALUES (?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, trainingId);
            preparedStatement.setString(2, trainingName);
            preparedStatement.setString(3, startDate);
            preparedStatement.setString(4, endDate);
            preparedStatement.setString(5, trainingMode);
            preparedStatement.setString(6, businessUnit);
            preparedStatement.setString(7, contactPersonId);

            int insertedRows = preparedStatement.executeUpdate();

            if (insertedRows > 0) {
                request.setAttribute("message", "Training added successfully. ID: " + trainingId);
            } else {
                request.setAttribute("message", "Error adding training with ID " + trainingId + ". No changes made.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("message", "Error: " + e.getMessage());
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        request.getRequestDispatcher("addTrainingResult.jsp").forward(request, response);
    }
}


