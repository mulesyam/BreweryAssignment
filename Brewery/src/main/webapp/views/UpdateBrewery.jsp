<!DOCTYPE html>
<html>
<head>
<title>form validation</title>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<%@ include file="Homepage.jsp"%><br>
<script type="text/javascript">  
        (function () {  
            'use strict';  
            window.addEventListener('load', function () {  
                var form = document.getElementById('needs-validation');  
                form.addEventListener('submit', function (event) {  
                    if (form.checkValidity() === false) {  
                        event.preventDefault();  
                        event.stopPropagation();  
                    }  
                    form.classList.add('was-validated');  
                }, false);  
            }, false);  
        })();  
</script>
</head>
 
 <body>
	<div class="container py-3">
		<div class="row">
			<div class="offset-md-2 col-md-9 offset-md-2">
				<div class="card">
					<div class="card-header bg-primary text-white">
						<h4 class="card-title text-uppercase">Update Brewery Form</h4>
					</div>
					<div class="card-body">
						<form id="needs-validation" novalidate
							class="well form-horizontal" action="/edit/{breweryid} " method="post">
							<div class="row">
								 <div class="col-sm-6 col-md-6 col-xs-12">
								      	<div class="form-group">
										   <label for="breweryid">Brewery Id:</label><br> 
										   <input type="text" name="breweryid" id="breweryid " class="form-control" required="required" />
										<div class="invalid-feedback">Please enter BreweryId .
										</div>
									</div>
								</div>
								<div class="col-sm-6 col-md-6 col-xs-12">
									<div class="form-group">
										<label for="name">Name:</label><br> <input type="text"
											name="name" id="name" class="form-control"
											required="required" />
										<div class="invalid-feedback">Please enter name.</div>
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col-sm-4 col-md-4 col-xs-12">
									<div class="form-group">
										<label for="brewerytype" >Brewery Type</label>
										 <select
											class="custom-select" id="brewerytype" name="brewerytype" required>
											<option value="">Select Type</option>
											<option value="1">Microbreweries</option>
											<option value="2">Brewpubs</option>
											<option value="3">Taproom breweries</option>
											<option value="4">regional breweries</option>
											<option value="5">contract brewing</option>
											<option value="6">Nano brewery</option>
											<option value="7">Independent brewer</option>

										</select>
										<div class="invalid-feedback">Please choose Brewery Type</div>
									</div>
								</div>
								<div class="col-sm-4 col-md-4 col-xs-12">
									<div class="form-group">
										<label class="form-label" for="address1">Address1</label> <input
											type="text" id="address1" name="address1"
											class="form-control form-control-lg" required="required">
										<div class="invalid-feedback">Please provide a valid
											address1.</div>
									</div>
								</div>
								<div class="col-sm-4 col-md-4 col-xs-12">
									<div class="form-group">
										<label class="form-label" for="address2">Address2</label> <input
											type="text" id="address2" name="address2"
											class="form-control form-control-lg" required="required" />
										<div class="invalid-feedback">Please provide a valid
											address2.</div>
									</div>
								</div>
								</div>




                      <div class="row">
								
									<div class="col-sm-4 col-md-4 col-xs-12">
									<div class="form-group">
										<label for="city" >City</label>
										 <select
											class="custom-select"   id="city" name="city" required>
											<option value="">Select Type</option>
											<option value="1">	Visakhapatnam</option>
											<option value="2">	Vijayawada</option>
											<option value="3">Guntur</option>
											<option value="4">Nellore</option>
											<option value="5">Kurnool</option>
											<option value="6">Kakinada</option>
											<option value="7">	Rajahmundry</option>
											<option value="8">Kadapa</option>
											<option value="8">Tirupati</option>
											<option value="9">Anantapuram</option>
											<option value="10">	Eluru</option>
											

										</select>
										<div class="invalid-feedback">Please choose city</div>
									</div>
								</div>
								
								<div class="col-sm-4 col-md-4 col-xs-12">
										<div class="form-group">
											<label for="stateprovince" >State Province</label> 
											<select class="custom-select" id="stateprovince" name="stateprovince" required>
												<option value="">select state</option>
												<option value="1">Andhra Pradesh</option>
												<option value="2">Arunachal Pradesh</option>
												<option value="3">Assam</option>
												<option value="4">Bihar</option>
												<option value="5">Chhattisgarh</option>
												<option value="6">Goa</option>
												<option value="7">Gujarat</option>
												<option value="8">Himachal Pradesh</option>
												<option value="9">Jammu and Kashmir</option>
												<option value="10">Karnataka</option>
												<option value="11">Kerala</option>
												<option value="12">Maharashtra</option>
												<option value="13">Meghalaya</option>
												<option value="14">Punjab</option>
												
												<option value="15">Tamil Nadu</option>
												<option value="16">Tripura</option>
												


											</select>
											<div class="invalid-feedback">Please choose state</div>
										</div>
									</div>
									
									
						<div class="col-sm-4 col-md-4 col-xs-12">
							<div class="form-group">
							  <label class="form-label" for="postalcode">Postal code</label>
                              <input type="text" id="postalcode"  name="postalcode" class="form-control form-control-lg" required="required"/>
					           <div class="invalid-feedback">Please provide postal code.</div>
							</div>
						</div>
			</div>



                                  
										<div class="form-group">
											<label for="country" >Country</label> 
											<select class="custom-select"  id="country" name="country" required>
												<option value="">select country</option>
												<option value="1">India</option>
												<option value="2">China</option>
												<option value="3">Indonesia</option>
												<option value="4">Pakistan</option>
												<option value="5">Bangladesh</option>
												<option value="6">Japan</option>
												<option value="7">Philippines</option>
												

											</select>
											<div class="invalid-feedback">Please choose country</div>
										</div>
						



			<div class="row">
									
									
			   <div class="col-sm-4 col-md-4 col-xs-12">
					   <div class="form-group">
								<label class="form-label" for="longitude">Longitude</label>
                                <input type="text" id="longitude"  name="longitude" class="form-control form-control-lg" required="required"/>
					        	<div class="invalid-feedback">Please provide  longitude.</div>
			          </div>
			   </div>
									
									
									
			 <div class="col-sm-4 col-md-4 col-xs-12">
					<div class="form-group">
							 <label class="form-label" for="latitude">latitude </label>
                            <input type="text" id="latitude" name="latitude" class="form-control form-control-lg"   required="required"/>
					        <div class="invalid-feedback">Please provide Latitude</div>
			        </div>
			</div>
			
			
			 <div class="col-sm-4 col-md-4 col-xs-12">
					<div class="form-group">
						   <label class="form-label" for="phone">Phone Number</label>
                            <input type="text" id="phone" name="phone" class="form-control form-control-lg"   required="required"/>
					        <div class="invalid-feedback">Please provide number</div>
			        </div>
			</div>
						
	    </div>
								
								
									
								
		<div class="row">
               
               <div class="col-sm-4 col-md-4 col-xs-12">
				   <div class="form-group">
                      <label class="form-label" for="websiteurl">Web site Url </label>
                      <input type="text" id="websiteurl" name="websiteurl" class="form-control form-control-lg"   required="required"/>
                   </div>
               </div>	
               		
                <div class="col-sm-4 col-md-4 col-xs-12">
				   <div class="form-group">
                          <label class="form-label" for="state">State</label>
                          <input type="text" id="state"  name="state" class="form-control form-control-lg" required="required"/>
                     </div>
               </div>
 

                <div class="col-sm-4 col-md-4 col-xs-12">
				   <div class="form-group">
                    <label class="form-label" for="street">Street</label>
                    <input type="text" id="street"  name="street" class="form-control form-control-lg" required="required"/>
                  </div>



</div>

                </div>
								
								<div class="form-outline">
                        <div class="col-md-12">
                            <button type="submit" class="btn btn-primary">
                               Update Data
                            </button>
                                                  </div>
                    </div>
							  </form>
							</div>
						</div>
					</div>
				</div>
			</div>
	
</body>
</html>
