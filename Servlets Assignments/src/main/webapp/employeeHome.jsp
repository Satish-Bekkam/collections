<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.demo.Training" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Home Page</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            background-color: light gray;            
            height: 100vh;
            margin: 0;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="content">
        <h2>Welcome, Employee</h2>

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
