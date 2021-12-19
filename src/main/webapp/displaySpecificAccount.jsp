<%@ page import="com.epam.pmt.entities.PasswordAccount" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<jsp:useBean id="security" class="com.epam.pmt.security.DataEncryptionDecryption"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .menu {
            font-family: 'Poppins', serif;
            margin: 30px 0;
            text-align: center;
            font-size: 16px;
            color: #682691d9;
        }

        .menu a {
            color: #77799;
            text-decoration: none;
        }

        .menu a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container text-center">
    <table class="table mt-4 table-bordered">
        <thead class="table-dark">
        <tr>
            <th>Account Name</th>
            <th>User Name</th>
            <th>Password</th>
            <th>Url</th>
        </tr>
        </thead>
        <tbody>
        <tr class="table-info">
            <td>${account.accountName}</td>
            <td> ${account.userName}</td>
            <td><%out.print(security.decryptData(((PasswordAccount) request.getAttribute("account")).getPassword()));%></td>
            <td>${account.url}</td>
        </tr>
        </tbody>
    </table>
</div>
<div class="menu">
    Go back to <a href="menu">Menu</a>
</div>
</body>
</html>
<%--javascript:history.back()--%>