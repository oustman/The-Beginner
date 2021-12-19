<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>All Accounts</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
<div class="container text-center">
    <jsp:useBean id="security" class="com.epam.pmt.security.DataEncryptionDecryption"/>
    <table class="table mt-4 table-bordered">
        <thead class="table-dark">
        <tr>
            <th>Group Name</th>
            <th>Account Name</th>
            <th>User Name</th>
            <th>Password</th>
            <th>Url</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${groups}" var="group">
            <c:if test="${group.getPasswordAccounts().size() != 0}">
                <c:forEach items="${group.getPasswordAccounts()}" var="account">
                    <tr class="table-info">
                        <td><c:out value="${group.getGroupName()}"></c:out></td>
                        <td><c:out value="${account.getAccountName()}"></c:out></td>
                        <td><c:out value="${account.getUserName()}"></c:out></td>
                        <td><c:out value="${security.decryptData(account.getPassword())}"></c:out></td>
                        <td><c:out value="${account.getUrl()}"></c:out></td>
                    </tr>
                </c:forEach>
            </c:if>
        </c:forEach>
        </tbody>
    </table>
</div>
<div class="menu">
    Go back to <a href="menu">Menu</a>
</div>
</body>
</html>
