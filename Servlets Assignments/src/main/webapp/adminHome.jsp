<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.demo.Training" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>

<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href=addTraining.jsp>Add Training</a>
  <a href=deleteTraining.jsp>Delete Traning</a>
</div>
    <div class="content">
        <h2>Welcome, Admin</h2>

    <%

    String JDBC_URL = "jdbc:mysql://localhost:3306/onlineTraining";
   String JDBC_USER = "root";
     String JDBC_PASSWORD = "12345678";
     Connection connection = null;

     PreparedStatement preparedStatement = null;
     ResultSet resultSet = null;
     List<Training> trainingList = new ArrayList<>();
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    String query = "SELECT * FROM Training";
    preparedStatement = connection.prepareStatement(query);
    resultSet = preparedStatement.executeQuery();

    %>
    <h2><table border="1">
        <tr>
            <th>Training ID</th>
            <th>Training Name</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Training Mode</th>
            <th>Business Unit</th>
            <th>Contact Person ID</th>
        </tr>
        <% while (resultSet.next()) {%>
         <tr>
      <td><%=resultSet.getString(1) %></td>
      <td><%=resultSet.getString(2) %></td>
      <td><%=resultSet.getString(3) %></td>
      <td><%=resultSet.getString(4) %></td>
      <td><%=resultSet.getString(5) %></td>
      <td><%=resultSet.getString(6) %></td>
      <td><%=resultSet.getString(7) %></td>
      </tr></h2>
      <%} %>
      
</table>
    </div>
</body>
</html>