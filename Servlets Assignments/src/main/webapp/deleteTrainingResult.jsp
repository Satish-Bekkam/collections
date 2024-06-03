<!DOCTYPE html>
<html>
<head>
    <title>Delete Training Result</title>
     <style>
         body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: url('https://miro.medium.com/v2/resize:fit:2000/format:webp/1*_gg1Te-7SJfk9E2D-mORfw.png') ;
            background-size: cover;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 300px;
            width: 100%;
            text-align: center;
        }
        .login-container h2 {
            margin-bottom: 20px;
        }
        .login-container input {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }
        .login-container input[type="submit"] {
            background-color: #007BFF;
            color: white;
            cursor: pointer;
        }
        .login-container input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .btn{
  border: none;
}
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2>Delete Training Result</h2>
    <p>${message}</p>
     <button class="btn"><a href=adminHome.jsp><h2>Home</h2></a></button>
     </div>
</body>
</html>
