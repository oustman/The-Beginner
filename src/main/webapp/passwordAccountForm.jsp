<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="content-type" content="text/html ;charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>accountDetailsForm</title>

    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>


</head>
<body>

  <form action="storeAccountDetails" method="post">

        <div class="md-form mb-5">
          <i class="fas fa-envelope prefix grey-text"></i>

            <input type="text" name="accountName" placeholder="Enter account name" required>
          <label data-error="wrong" data-success="right" for="accountName">Your accountName</label>
        </div>

        <div class="md-form mb-4">
          <i class="fas fa-lock prefix grey-text"></i>

          <input type="text" name="password" id="orangeForm-pass" class="form-control validate">
          <label data-error="wrong" data-success="right" for="password">Your password</label>
        </div>


        <div class="md-form mb-4">
          <i class="fas fa-lock prefix grey-text"></i>

           <input type="text" name="userName" placeholder="Enter your username" required>
          <label data-error="wrong" data-success="right" for="userName">Your userName</label>
        </div>


        <div class="md-form mb-4">
          <i class="fas fa-lock prefix grey-text"></i>

                    <input type="text" name="url" placeholder="Enter url" required>
          <label data-error="wrong" data-success="right" for="url">YourURl</label>
        </div>


	<div class="md-form mb-4">
          <i class="fas fa-lock prefix grey-text"></i>

                    <input type="text" name="groupName" placeholder="Enter group name" required>
          <label data-error="wrong" data-success="right" for="groupName">GroupName</label>
        </div>






      </div>
      <div class="modal-footer d-flex justify-content-center">
       <div class="button">
                <input type="submit" value="Submit">
            </div>
      </div>
</form>
  <div class="menu">
        Go back to <a href="menu">Menu</a>
    </div>
    </div>
  </div>
</div>














</div>
</body>
</html>