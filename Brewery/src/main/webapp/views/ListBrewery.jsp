<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
      <title>List of Single Brewery  </title>
<head>
<%@ include file="Homepage.jsp"%>
	
</head>
<body>

	<div class="col-sm-5" align = "center">
                 <div class="panel-body" align = "center" >
                 <table class="table" >
  <thead class="thead-dark" >
    <tr>
      		        <th>Brewery Id</th>
					<th>Name</th>
					<th>Brewery Type</th>
					<th>Address1</th>
					<th>Address2</th>
					<th>City</th>
					<th>State Province</th>
					<th>Postal code</th>
					<th>Country</th>
					<th>Longitude</th>
					<th>Latitude</th>
					<th>Phone Number</th>
					<th>WebsiteUrl</th>
					<th>State</th>
					<th>Street</th>
					<th>Update</th>
					<th>Delete</th>
   	</tr>
  </thead>
  <tbody>
  
     <tr th:each="user ${singlebrewery}">
						<td th:text="${user.breweryid}"/>
						<td th:text="${user.name}"/>
						<td th:text="${user.brewerytype}"/>
						<td th:text="${user.address1}"/>
						<td th:text="${user.address2}"/>
						<td th:text="${user.city}"/>
						<td th:text="${user.stateprovince}"/>
						<td th:text="${user.postalcode}"/>
						<td th:text="${user.country}"/>
						<td th:text="${user.longitude}"/>
						<td th:text="${user.latitude}"/>
						<td th:text="${user.phone}"/>
						<td th:text="${user.websiteurl}"/>
						<td th:text="${user.state}"/>
						<td th:text="${user.street}"/>
						<td th:text="${user.update}"/>
						<td th:text="${user.delete}"/>
					</tr>
  </tbody>
</table>
                 </div>
            </div> 
	
</body>
</html>