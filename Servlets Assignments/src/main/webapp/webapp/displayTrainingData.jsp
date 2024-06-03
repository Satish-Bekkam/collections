<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.demo.Training" %>

<!DOCTYPE html>
<html>
<head>
    <title>Display Training Data</title>
</head>
<body>
    <h2>Fetched Data from Training Table</h2>
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
   
    
    %>
    <table border="1">
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
      </tr>
      <%} %>
           <!--  Training training = new Training();
            training.setTrainingId(resultSet.getString("TrainingID"));
            training.setTrainingName(resultSet.getString("TrainingName"));
            training.setStartDate(resultSet.getString("StartDate"));
            training.setEndDate(resultSet.getString("EndDate"));
            training.setTrainingMode(resultSet.getString("TrainingMode"));
            training.setBusinessUnit(resultSet.getString("BusinessUnit"));
            training.setContactPersonId(resultSet.getString("ContactPersonID"));
            trainingList.add(training); -->
        }
       
     
      
    </table>
</body>
</html>
