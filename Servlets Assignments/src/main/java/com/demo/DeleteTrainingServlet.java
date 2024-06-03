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

@WebServlet("/deleteTraining")
public class DeleteTrainingServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlineTraining";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345678";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String trainingId = request.getParameter("trainingId");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            String deleteQuery = "DELETE FROM Training WHERE TrainingID = ?";

            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, trainingId);

                        int deletedRows = preparedStatement.executeUpdate();

            if (deletedRows > 0) {
                request.setAttribute("message", "Training with ID " + trainingId + " deleted successfully.");
            } else {
                request.setAttribute("message", "No training found with ID " + trainingId + ". No deletion performed.");
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

        request.getRequestDispatcher("deleteTrainingResult.jsp").forward(request, response);
    }
}

