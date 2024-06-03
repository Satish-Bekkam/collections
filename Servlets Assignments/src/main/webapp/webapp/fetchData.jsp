<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.demo.Training" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String JDBC_URL = "jdbc:mysql://localhost:3306/onlineTraining";
String JDBC_USER = "root";
  String JDBC_PASSWORD = "wipro123";
  Connection connection = null;
  PreparedStatement preparedStatement = null;
  ResultSet resultSet = null;
  List<Training> trainingList = new ArrayList<>();
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
%>
</body>
</html>