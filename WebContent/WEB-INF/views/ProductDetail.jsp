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
	<script src="<spring:url value='/bootstrap/js/jquery.js'/>"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
function getOptions(beertype) {
	var list;
	var listValue;
	if (beertype == "MP") {
		list = new Array("Gwalior","Bhopal","Indore","Ujjain","Jabalpur");
		listValue = new Array("Gwalior","Bhopal","Indore","Ujjain","Jabalpur");
		
		
	}
	if (beertype == "UP") {
		list = new Array("Agra","Kanpur","lucknow","Mathrua");
		listValue = new Array("Agra","Kanpur","lucknow","Mathrua");
		
	}
	if (beertype == "MH") {
		list = new Array("Black Butte","Pete's Wicked","Guiness");
		listValue = new Array("Black Butte","Pete's Wicked","Guiness");
		
	}
	for (var i = 0; i < document.OptionMaker.state.length; i++) { //Clear the 2nd menu
		document.OptionMaker.city.options[i] = null;
		
	}
	for (var i = 0; i < list.length; i++) { //Repopulate 2nd menu
		document.OptionMaker.city.options[i] = new Option(list[i],listValue[i],0,0);
		
	}
	
}

</script>
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
   
 

<<%-- form name="OptionMaker" action="/Online_Bike_Booking_Customizing/cart/addcart"  method="post">
  
  
  <div class="container-fluid bg-3 text-center" >    
  <div class="row">
    <div class="col-sm-3">
    <div class="thumbnail">
      <img src='<spring:url value="/uploads/${sessionScope.bike.image}"></spring:url>' alt="...">
      <div class="caption">
        <h3>${sessionScope.bike.bikeName}</h3>
        <h3>${sessionScope.bike.price}</h3>
  <!-- <p><a href="../cart/addcart"  class="btn btn-primary" role="button"  >Add TO Cart</a> <a href="../cart/order" class="btn btn-default" role="button">Button</a></p> -->      
      </div>
    </div>
  </div>
</div>
</div>
  
  <p>
  SELECT State<select  name="state" onchange="getOptions(this.value)">
     <option label="---select--">---select--</option>
    <option value="MP">MP</option>
    <option value="UP">UP</option>
    <option value="MH">MH</option>
 </select>&nbsp;&nbsp;&nbsp;&nbsp;<br/> SELECT City <select  name="city">
  </select>&nbsp;&nbsp;&nbsp;&nbsp;<br/>  Select ShowRoom<select  name="showroom">
  <option value="HERO">HERO</option>
    <option value="HONDA">HONDA</option>
    <option value="TVS">TVS</option>
    <option value="Pluser">Pluser</option>
    <option value="Bjaj">Bjaj</option>
    <option value="passion">passion</option>
  </select></p>
  <input type="submit" class="btn btn-primary" role="button"  value="book"></input>
  
</form --%>>
 
  <div class="container-fluid bg-3 text-center" >    
  <div class="row">
    <div class="col-sm-3" style="height: 700px;">
    <div class="thumbnail">
      <img src='<spring:url value="/uploads/${sessionScope.bike.image}"></spring:url>' alt="...">
    </div>
  </div>
   <%-- <div class="col-sm-3">
   <div class="caption">
        <h3>${sessionScope.serachbike.bikeName}</h3>
        <h3>${sessionScope.serachbike.price}</h3></div>
         <h3>${sessionScope.serachbike.bikeDescription}</h3></div> --%>
          <div class="col-md-7">
         <form name="OptionMaker" action="/Online_Bike_Booking_Customizing/cart/addcart"  method="post">
					<h4>BikeName</h4><div class="product-title">${sessionScope.bike.bikeName}</div>
					<hr>
					<h4>BikeDescription</h4><div class="product-desc">${sessionScope.bike.bikeDescription}</div>
					<div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
					<hr>
					<h4>Price</h4><div class="product-price">${sessionScope.bike.price}</div>
					<hr>
					 <p>
  SELECT State<select  name="state" onchange="getOptions(this.value)">
     <option label="---select--">---select--</option>
    <option value="MP">MP</option>
    <option value="UP">UP</option>
    <option value="MH">MH</option>
 </select>&nbsp;&nbsp;&nbsp;&nbsp;<br/> SELECT City <select  name="city">
  </select>&nbsp;&nbsp;&nbsp;&nbsp;<br/>  Select ShowRoom<select  name="showroom">
  <option value="HERO">HERO</option>
    <option value="HONDA">HONDA</option>
    <option value="TVS">TVS</option>
    <option value="Pluser">Pluser</option>
    <option value="Bjaj">Bjaj</option>
    <option value="passion">passion</option>
  </select></p>
  
  <div class="btn-group cart">
						<button type="submit" class="btn btn-success" value="submit">
							Book Now
						</button>
					</div>	
					<div class="btn-group wishlist">
						<p><a href="/Online_Bike_Booking_Customizing/custcontroller/beforecust?idparam=${sessionScope.bike.bikeId}" class="btn btn-primary" role="button"  >Customizing</a> 
						</div>
						
						
						
</form>
					
		
				
   </div>
</div>
</div>
  
</body>
</html>