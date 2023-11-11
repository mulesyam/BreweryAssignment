<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random Brewery</title>
<%@ include file="Homepage.jsp"%> <br>
</head>
<body>
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
     <a class="navbar-brand">RandomSearch</a>
    <form class="d-flex">
      <input class="form-control me-2"  id="query" name="query" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
</nav>
</body>
</html>