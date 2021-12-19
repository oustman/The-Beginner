<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <title>menu</title>
</head>
<body>
<h1>Welcome</h1>


<form action="operation" method="post">

<div class="custom-control custom-radio">
        <input type="radio" class="custom-control-input" id="radio1" name="operation" value="OPTION1" checked>
        <label class="custom-control-label" for="radio1"> Store Account Login Credentials </label>
    </div>

    <div class="custom-control custom-radio">
        <input type="radio" class="custom-control-input" id="radio2" name="operation" value="OPTION2">
        <label class="custom-control-label" for="radio2"> Display Specific Account Login Credentials </label>
    </div>
    <div class="custom-control custom-radio">
        <input type="radio" class="custom-control-input" id="radio3" name="operation" value="OPTION3">
        <label class="custom-control-label" for="radio3"> Update Account Login Credentials </label>
    </div>
    <div class="custom-control custom-radio">
        <input type="radio" class="custom-control-input" id="radio4" name="operation" value="OPTION4">
        <label class="custom-control-label" for="radio4"> Delete Account Login Credentials </label>
    </div>
    <div class="custom-control custom-radio">
        <input type="radio" class="custom-control-input" id="radio5" name="operation" value="OPTION5">
        <label class="custom-control-label" for="radio5"> Display All Account Login Credentials </label>
    </div>
    <div class="custom-control custom-radio">
        <input type="radio" class="custom-control-input" id="radio6" name="operation" value="OPTION6">
        <label class="custom-control-label" for="radio6"> Rename Group </label>
    </div>
    <div class="custom-control custom-radio">
        <input type="radio" class="custom-control-input" id="radio7" name="operation" value="OPTION7">
        <label class="custom-control-label" for="radio7"> Delete Group </label>
    </div>
    <input type="submit" value="Submit">
</form>
</body>
</html>
</html>