<!DOCTYPE html>
<html>
<head>
    <title>Add Training</title>
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
        .training-form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }
        .training-form h2 {
            margin-bottom: 20px;
        }
        .training-form table {
            width: 100%;
            margin-bottom: 10px;
            border-collapse: collapse;
        }
        .training-form th, .training-form td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        .training-form th {
            background-color: #f5f5f5;
        }
        .training-form input {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
            box-sizing: border-box;
        }
        .training-form input[type="submit"] {
            background-color: #007BFF;
            color: white;
            cursor: pointer;
        }
        .training-form input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="training-form">
        <h2>Add Training</h2>
        <form action="addTrain" method="post">
            <table>
                <tr>
                    <th>Training ID:</th>
                    <td><input type="text" name="trainingId" required></td>
                </tr>
                <tr>
                    <th>Training Name:</th>
                    <td><input type="text" name="trainingName" required></td>
                </tr>
                <tr>
                    <th>Start Date:</th>
                    <td><input type="date" name="startDate" required></td>
                </tr>
                <tr>
                    <th>End Date:</th>
                    <td><input type="date" name="endDate" required></td>
                </tr>
                <tr>
                    <th>Training Mode:</th>
                    <td><select name="trainingMode" required>
                        <option value="Online">Online</option>
                        <option value="Offline">Offline</option>
                    </select></td>
                </tr>
                <tr>
                    <th>Business Unit:</th>
                    <td><input type="text" name="businessUnit" required></td>
                </tr>
                <tr>
                    <th>Contact Person ID:</th>
                    <td><input type="text" name="contactPersonId" required></td>
                </tr>
            </table>
            <input type="submit" value="Add Training">
        </form>
    </div>
</body>
</html>
