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
  <style>
  @import "compass/css3";

@import url(http://fonts.googleapis.com/css?family=Merriweather);
$red: #e74c3c;

*, 
*:before, 
*:after {
   @include box-sizing(border-box); 
}

html, body {
  background: #f1f1f1;
  font-family: 'Merriweather', sans-serif;
  padding: 1em;
}

h1 {
   text-align: center;
   color: #a8a8a8;
   @include text-shadow(1px 1px 0 rgba(white, 1));
}

form {
   max-width: 600px;
   text-align: center;
   margin: 20px auto;
  
  input, textarea {
     border:0; outline:0;
     padding: 1em;
     @include border-radius(8px);
     display: block;
     width: 100%;
     margin-top: 1em;
     font-family: 'Merriweather', sans-serif;
     @include box-shadow(0 1px 1px rgba(black, 0.1));
     resize: none;
    
    &:focus {
       @include box-shadow(0 0px 2px rgba($red, 1)!important);
    }
  }
  
  #input-submit {
     color: white; 
     background: $red;
     cursor: pointer;
    
    &:hover {
       @include box-shadow(0 1px 1px 1px rgba(#aaa, 0.6)); 
    }
  }
  
  textarea {
      height: 126px;
  }
}


.half {
  float: left;
  width: 48%;
  margin-bottom: 1em;
}

.right { width: 50%; }

.left {
     margin-right: 2%; 
}


@media (max-width: 480px) {
  .half {
     width: 100%; 
     float: none;
     margin-bottom: 0; 
  }
}


/* Clearfix */
.cf:before,
.cf:after {
    content: " "; /* 1 */
    display: table; /* 2 */
}

.cf:after {
    clear: both;
}
  </style>
</head>
<body>

<div class="navbar-collapse collapse" style="font-size: 20px" >
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" role="button" data-toggle="dropdown" href="#"><i class="glyphicon glyphicon-user"></i >&nbsp ${sessionScope.firstname}</a>
                    
                       
                </li>
                <li><a href="/EfarmingProject/user/logout"><i class="glyphicon glyphicon-lock"></i> Logout</a></li>
                 <li><a href="/Online_Bike_Booking_Customizing/cart/showcart"><i class="glyphicon glyphicon-shopping-cart">${sessionScope.sizeOfMap}</i>&nbsp Cart</a></li>
            </ul>
            
            <ul class="nav navbar-nav navbar-left">
                <li class="dropdown">
                    <a role="button" href="/Online_Bike_Booking_Customizing/homepage/userhome"><i class="glyphicon glyphicon-home"></i >&nbsp home</a>
                    
                       
                </li>
                <li><a href="#"><i class="glyphicon glyphicon-book"></i> Forum</a></li>
                 <li><a href="#"><i class="glyphicon glyphicon-"></i>Reset password</a></li>
            </ul>
            
             </div>	
   

            
                   <form:form modelAttribute="addressTable" method="POST" class="cf">
						<div class="form-group" class="half left cf"> 	 
                			<label for="street"><span class="req">* </span> street: </label>
                    		<form:input path="street" ccsClass="form-control" type="text" id="input-email" /> 
                     		<div id="errFirst"></div>    
            			</div>
            	
            			<div class="form-group"> 	 
                			<label for="city"><span class="req">* </span> city: </label>
                    		<form:input path="city" d="input-email" ccsClass="form-control" type="text" id = "city" placeholder="Enter your city"  /> 
                     		<div id="errFirst"></div>    
            			</div>
					
						<div class="form-group"> 	 
                			<label for="state"><span class="req">* </span> state: </label>
                    		<form:input path="state" d="input-email" ccsClass="form-control" type="text" id = "state" placeholder="Enter your state"  /> 
                     		<div id="errFirst"></div>    
            			</div>
            			
            			<div class="form-group"> 	 
                			<label for="pincode"><span class="req">* </span> pincode: </label>
                    		<form:input path="pincode" d="input-email" ccsClass="form-control" type="text" id = "pincode" placeholder="Enter your pincode"  /> 
                     		<div id="errFirst"></div>    
            			</div>
            			<div class="form-group"> 	 
                			<label for="country"><span class="req">* </span> country: </label>
                    		<form:input path="country"  d="input-email" ccsClass="form-control" type="text" id = "pincode" placeholder="Enter your pincode"  /> 
                     		<div id="errFirst"></div>    
            			</div>
					
					
					<input type="submit" formaction="/Online_Bike_Booking_Customizing/OrderController/orderdone" value="Save" />
					</form:form>
                    
                    
                    <!--SHIPPING METHOD END-->
                   
               
              
            <div class="row cart-footer">
        
            </div>
    </div>
</body>
</html>