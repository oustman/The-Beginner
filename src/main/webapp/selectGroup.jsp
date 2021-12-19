<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
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
<div class="container text-center m-5">
    <form action="${view}" method="post">
        <label for="groups">Groups: </label>
        <select name="groupName" id="groups">
            <option value="" selected="selected">Select Group</option>
            <c:forEach items="${groupNames}" var="groupName">
            <option value=${groupName}>${groupName}</option>
            </c:forEach>
        </select> <br><br>
        <c:if test="${view == \"renameGroup\"}">
            <label for="groupName">Group Name: </label>
            <input type="text" id="groupName" name="newGroupName" placeholder="Enter new group name" required>
        </c:if> <br><br>
            <input type="submit" value="Submit">
    </form>
    <br><br>
    <div class="menu">
        Go back to <a href="menu">Menu</a>
    </div>
</div>
</body>
</html>