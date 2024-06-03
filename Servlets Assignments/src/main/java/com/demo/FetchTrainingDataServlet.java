package com.demo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetchTrainingData")
public class FetchTrainingDataServlet extends HttpServlet {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/onlineTraining";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "12345678";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Training> trainingList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            String query = "SELECT * FROM Training";
            preparedStatement = connection.prepareStatement(query);

     
            resultSet = preparedStatement.executeQuery();
            

            while (resultSet.next()) {
                Training training = new Training();
                training.setTrainingId(resultSet.getString("TrainingID"));
                training.setTrainingName(resultSet.getString("TrainingName"));
                training.setStartDate(resultSet.getString("StartDate"));
                training.setEndDate(resultSet.getString("EndDate"));
                training.setTrainingMode(resultSet.getString("TrainingMode"));
                training.setBusinessUnit(resultSet.getString("BusinessUnit"));
                training.setContactPersonId(resultSet.getString("ContactPersonID"));
                trainingList.add(training);
            }
            System.out.print("size"+trainingList.size());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
           
        } finally {
           
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
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

        request.setAttribute("trainingList", trainingList);

        request.getRequestDispatcher("displayTrainingData.jsp").forward(request, response);
    }
}
