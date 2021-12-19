
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>

    <title>Register</title>
   <meta http-equiv="content-type" content="text/html ;charset=UTF-8">
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>



<section class="vh-100" style="background-color: #eee;">
  <div class="container h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-12 col-xl-11">
        <div class="card text-black" style="border-radius: 25px;">
          <div class="card-body p-md-5">
            <div class="row justify-content-center">
              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign In</p>

                <form  action="session" method="post">

                    <div class="txt_field">
                               <input type="text" name="userName" required>
                               <span></span>
                               <label>Username</label>
                           </div>
                           <br/>
                           <div class="txt_field">
                               <input type="password" name="password" required>
                               <span></span>
                               <label>Password</label>
                           </div>
                           <br/>
                           <div class="pass"><a href="#">Forgot Password ?</a></div>
                           <input type="submit" value="Login">
                           <div class="signup_link">
                               Don't have an account ? <a href="signup">Sign Up</a>
                           </div>
                  </div>

</form>









              </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>