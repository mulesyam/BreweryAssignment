<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Brewerys login</title>
</head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@ include file="Homepage.jsp"%><br>
<style>


#login .container #login-row #login-column #login-box {
   margin-top: 15px;
  max-width: 550px;
  height: 390px;
  border: 2px solid #9C9C9C;
  background-color: #EAEAEA;
}
#login .container #login-row #login-column #login-box #login-form {
  padding: 40px;
}
#login .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
</style>

</head>
<body>
    <div id="login">
        <h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="/breweryslogin" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Email:</label><br>
                                <input type="text" name="email" id="=email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                 <input type="password" name="password" id="password" class="form-control"  id="showCursor" class="fas fa-eye-slash" onclick="showPassword(event)" > 
                            </div>
                            <div class="form-group">
                                <label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                                <input type="submit" name="submit"class="btn btn-success" value="submit">
                                                              
                            </div>
                           
                            
                            <div id="register-link" class="text-right">
                                <a href="/breweryregistration" class="text-info">Register here</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <script>	
    function showPassword(e){
    	  var input = document.getElementById('password')
    	  if(input.type === 'password'){
    	    input.type = "text"
    	    e.target.className = "fas fa-eye"
    	  }else{
    	    input.type = "password"
    	    e.target.className = "fas fa-eye-slash"
    	  }
    	}
    </script>
</body>
</html>