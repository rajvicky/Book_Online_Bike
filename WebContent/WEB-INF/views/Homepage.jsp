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
<style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
      padding: 12px;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  
    .carousel-inner img {
      width: 80%; /* Set width to 100% */
      min-height: 100px;
    }

    /* Hide the carousel text when the screen is less than 600 pixels wide */
    @media (max-width: 400px) {
      .carousel-caption {
        display: none; 
      }
     .row.content {height: auto;} 
  </style>
</head>
<body style="padding: 10px;">

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
        <a href="/Online_Bike_Booking_Customizing/cart/showcart" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-shopping-cart"></span> ${sessionScope.sizeOfMap}
        </a>
        <li><a href="/Online_Bike_Booking_Customizing/Login/log"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="/Online_Bike_Booking_Customizing/customer/reg"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      </ul>
    </div>
  </div>
</nav>
<!-- ------------- -->
  <div class="container" style="padding-top: 10px;">
<div class="row">
<div class="col-sm-4" style="padding:0px;">
    <div class="well">
      <p>Some text..</p>
    </div>
    <div class="well">
       <p>Upcoming Events..</p>
    </div>
    <div class="well">
       <p>Visit Our Blog</p>
    </div>
  </div>


<!-- Carousel- -->

  <div class="col-sm-8">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
      </ol>

      <!-- Wrapper for slides -->
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
          <div class="carousel-caption">
            <h3>Sell $</h3>
            <p>Money Money.</p>
          </div>      
        </div>

        <div class="item">
          <img src="https://placehold.it/800x400?text=Another Image Maybe" alt="Image">
          <div class="carousel-caption">
            <h3>More Sell $</h3>
            <p>Lorem ipsum...</p>
          </div>      
        </div>
      </div>

      <!-- Left and right controls -->
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </div>
  
</div>
<hr>
</div>
     
  <!-- -----  -->
<div class="container-fluid bg-3 text-center">    
  <h3>Some of my Work</h3><br>
  <div class="row">
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
  </div>
</div><br>



<div class="container-fluid bg-3 text-center">    
  <div class="row">
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3"> 
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
    <div class="col-sm-3">
      <p>Some text..</p>
      <img src='<spring:url value="/images/1.jpg"></spring:url>' class="img-responsive" style="width:100%" alt="Image">
    </div>
  </div>
</div><br><br>




<!-- ---retrieve product -->
<div class="col-sm-10 col-md-6 col-lg-10" style="background-color:;padding: 25px;padding-left: 20px">
<c:forEach var="item" items="${sessionScope.li}" >

<div class="col-xs-6 col-md-3" style="border: solid;padding: 25px;margin: 30px;">    
  <div class="row">
   <!--   <div class="col-sm-3">-->
    <div class="thumbnail">
      <img src='<spring:url value="/uploads/${item.image}"></spring:url>' alt="..." class="img-responsive" style="width:200px;height: 200px">
      <div class="caption">
        <h3>${item.bikeName}</h3>
        <h3>${item.bikeId}</h3>
        <p><a href="/Online_Bike_Booking_Customizing/homepage/product?idparam=${item.bikeId}"  class="btn btn-primary" role="button"   >Detail</a> <a href="/Online_Bike_Booking_Customizing/OrderController/order?id=${item.bikeId}" class="btn btn-default" role="button">Book Now</a></p>
      </div>
   <!-- </div>--> 
  </div>
</div>
</div>
</c:forEach>
</div>

<!-- -------------end retrieve product -->





</body>
</html>