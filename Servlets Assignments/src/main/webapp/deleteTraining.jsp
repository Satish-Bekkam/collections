<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Training Page</title>
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
        .delete-form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 300px;
            width: 100%;
            text-align: center;
        }
        .delete-form h2 {
            margin-bottom: 20px;
        }
        .delete-form input {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }
        .delete-form input[type="submit"] {
            background-color: #FF0000;
            color: white;
            cursor: pointer;
        }
        .delete-form input[type="submit"]:hover {
            background-color: #cc0000;
        }
    </style>
</head>
<body>
 <div class="delete-form">
    <h2>Delete Training</h2>
    <form action="deleteTraining" method="post">
        Training ID: <input type="text" name="trainingId" required><br>
        <input type="submit" value="Delete Training">
    </form>
    </div>
</body>
</html>
