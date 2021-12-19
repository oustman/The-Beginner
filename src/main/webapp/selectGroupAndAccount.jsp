<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Select Group And Account</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .menu {
            font-family: 'Poppins', serif;
            margin: 30px 0;
            text-align: center;
            font-size: 16px;
            color: #666666;
        }

        .menu a {
            color: #2691d9;
            text-decoration: none;
        }

        .menu a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container m-5 text-center">
    <form name="form1" action=${view} method="post">
        Groups: <select name="groupName" id="groupsMenu">
        <option value="" selected="selected">Select Group</option>
    </select> &emsp; &emsp; &emsp;
        Accounts: <select name="accountName" id="accountsMenu">
        <option value="" selected="selected">Please select Group first</option>
    </select> <br> <br>
        <c:if test="${view == \"updateAccountDetails\"}">
            <label for="userName">Username : </label>
            <input type="text" id="userName" name="userName" placeholder="Enter new username" required> &emsp;
            <label for="password">Password : </label>
            <input type="password" id="password" name="password" placeholder="Enter new password" required> &emsp;
            <label for="url">Url : </label>
            <input type="text"  id="url" name="url" placeholder="Enter new url" required>
        </c:if> <br><br>
        <input type="submit" value="Submit">
    </form>
    <br>
    <div class="menu">
        Go back to <a href="menu">Menu</a>
    </div>
</div>

<script>
    var groupsAndAccounts = ${groupsAndAccounts}
        window.onload = function () {
            var groupSelected = document.getElementById("groupsMenu");
            var accountSelected = document.getElementById("accountsMenu");
            for (var x in groupsAndAccounts) {
                groupSelected.options[groupSelected.options.length] = new Option(x, x);
            }
            groupSelected.onchange = function () {
                accountSelected.length = 1;
                var y = groupsAndAccounts[groupSelected.value];
                for (var i = 0; i < y.length; i++) {
                    accountSelected.options[accountSelected.options.length] = new Option(y[i], y[i]);
                }
            }
        }
</script>
</body>
</html>