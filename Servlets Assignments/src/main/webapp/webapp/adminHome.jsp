<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Home Page</title>
  <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .admin-welcome {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }
        .admin-welcome h2 {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="admin-welcome">
        <h2>Welcome, Admin</h2>
        <p>${message}</p>
        <a href=addTraining.jsp>Click Here To Add</a>
        <a href=deleteTraining.jsp>Click To Delete</a>
        <a href=displayTrainingData.jsp>Click Here To view</a>
           </div>
</body>
</html>
