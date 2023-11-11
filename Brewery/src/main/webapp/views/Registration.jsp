<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Brewerys Registration Form</title>
</head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%@ include file="Homepage.jsp"%><br>


</head>
<body>
   <section class="vh-80 gradient-custom ">
  <div class="container py-5 h-50">
    <div class="row justify-content-center align-items-center h-80" >
      <div class="col-12 col-lg-9 col-xl-7">
        <div class="card shadow-2-strong card-registration" style="border-radius: 5px;">
          <div class="card-body p-4 p-md-4">
            <h3 class="card-title text-uppercase">Registration Form</h3>
            <form action="/userRegistration" method="post" >
            
                     <div class="form-group">
                                <label for="breweryid" >Brewery Id:</label><br>
                                <input type="text" name="breweryid" id="breweryid" class="form-control"  required/>
                            </div>
              <div class="row">
                <div class="col-md-6 mb-4 pb-1">

                  <div class="form-outline">
                   <label class="form-label" for="firstname">First Name</label>
                   <input type="text" id="firstname" name="firstname" class="form-control form-control-lg"   required/>
                  </div>

                </div>
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <label class="form-label" for="lastname">Last Name</label>
                    <input type="text" id="lastname"  name="lastname"class="form-control form-control-lg" required/>
                  </div>

                </div>
              </div>
               
                
            

              <div class="row">
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                                      <label class="form-label" for="email">Email*</label>
                    <input type="email" id="email" name="email" class="form-control form-control-lg"  required >
                  </div>

                </div>
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <label class="form-label" for="phoneNumber">Phone Number</label>
                    <input type="tel" id="phonenumber" pattern="^\d{10}$"  name="phonenumber"class="form-control form-control-lg" required/>
                  </div>

                </div>
              </div>
              
              <div class="row">
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                                      <label class="form-label" for="password">Password</label>
                    <input type="password" id="password" name="password"class="form-control form-control-lg"  required />
                  </div>

                </div>
                <div class="col-md-6 mb-4 pb-2">

                  <div class="form-outline">
                    <label class="form-label" for="conformpassword">Conform Password</label>
                    <input type="password" id="conformpassword"  name="conformpassword"  class="form-control form-control-lg" required />
                  </div>

                </div>
              </div>
              
              
              
                 <div class="form-outline">
                   <label class="form-label" for="address">Address</label>
                   <input type="text" id="address"  name="address"class="form-control form-control-lg"   required/>
                  </div>
                  <br>
                  

             

   <div class="form-outline">
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">
                                Register
                            </button>
                            <a href="/userlogin">Already have an account?</a>
                        </div>
                    </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
    
</body>
</html>