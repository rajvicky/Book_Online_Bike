<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="<spring:url value='/bootstrap/css/bootstrap.css'/>"
	type="text/css" />
	<link rel="stylesheet" href="<spring:url value='/bootstrap/css/bootstrap.min.css'/>"
	rel="stylesheet" />
	<script src="<spring:url value='/bootstrap/jquery/jquery-1.10.2.min.js'/>"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>




   <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Portfolio</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Gallery</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
           <li>
      <li class="dropdown">
    <a class="dropdown-toggle" role="button" data-toggle="dropdown" href="#">
    <i class="glyphicon glyphicon-user"></i >&nbsp ${sessionScope.firstname}</a></li>
         <li><a href="/Online_Bike_Booking_Customizing/customer/reg"><i class="glyphicon glyphicon-lock"></i> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>





<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-2 well">
      <div class="thumbnail">
        <p>Upcoming Events:</p>
        <img src="paris.jpg" alt="Paris" width="400" height="300">
        <p><strong>Paris</strong></p>
        <p>Fri. 27 November 2015</p>
        <button class="btn btn-primary">Info</button>
      </div>      
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
      <a href="/Online_Bike_Booking_Customizing/admin/invoice"><button class="btn btn-primary">Invoice</button></a>
      </div>
    </div>
    
    
    
    <div class="col-sm-6">
          
          
          <!-- -form -->
         
         
         
         <form:form enctype="multipart/form-data" class="well form-horizontal"  method="POST" modelAttribute="bikeStore" >
				 <div class="container">
				 <fieldset>
         
         <div class="form-group">
				  <label class="col-sm-3 control-label">BikeName</label>  
				  <div class="col-md-4 inputGroupContainer">
				  <div class="input-group">
				  <form:input path="bikeName" class="form-control"/>
				  </div>
				  </div>
				  </div>
				  
				  
				   <div class="form-group">
				  <label class="col-sm-3 control-label">BikePrice</label>  
				  <div class="col-md-4 inputGroupContainer">
				  <div class="input-group">
				  <form:input path="price" class="form-control"/>
				  </div>
				  </div>
				  </div>
				  
          <div class="form-group">
				  <label class="col-sm-3 control-label">BikeDescription</label>  
				  <div class="col-md-4 inputGroupContainer">
				  <div class="input-group">
				  <form:input path="bikeDescription" class="form-control"/>
				  </div>
				  </div>
				  </div>
         
             <div class="form-group">
				  <label class="col-sm-3 control-label">BikeDescription</label>  
				  <input   type="file" name="image" id="js-upload-files" />
				  </div>
				  
				  
        
          <div class="form-group"> 
				  <label class="col-sm-3 control-label">Category</label>
				    <div class="col-md-4 selectContainer">
				    <div class="input-group">
				      <form:select path="category.bikeName">
					<form:options items="${sessionScope.list}" />
					</form:select>
					  </div>
					</div>
					</div>
         
         
					<div class="form-group">
					  <label class="col-sm-3 control-label"></label>
					  <div class="col-md-4"><br>
					    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-warning" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
					  </div>
					</div>
              </fieldset>
              </div>
              </form:form>
               <!-- end form -->
      
      </div>
    </div>
  </div>
<footer class="container-fluid">
  <p>Footer Text</p>
</footer>
</body>
</html>