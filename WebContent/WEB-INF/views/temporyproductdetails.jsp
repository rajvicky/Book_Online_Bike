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
	<script src="<spring:url value='/bootstrap/js/jquery.js'/>"></script>
	<script src="<spring:url value='/bootstrap/jquery/jquery-1.10.2.min.js'/>"></script>
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
  
  <style type="text/css">
  /*********************************************
    			Call Bootstrap
*********************************************/

@import url("bootstrap/bootstrap.min.css");
@import url("bootstrap-override.css");
@import url("//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css");

/*********************************************
        		Theme Elements
*********************************************/

.gold{
	color: #FFBF00;
}

/*********************************************
					PRODUCTS
*********************************************/

.product{
	border: 1px solid #dddddd;
	height: 321px;
}

.product>img{
	max-width: 230px;
}

.product-rating{
	font-size: 20px;
	margin-bottom: 25px;
}

.product-title{
	font-size: 20px;
}

.product-desc{
	font-size: 14px;
}

.product-price{
	font-size: 22px;
}

.product-stock{
	color: #74DF00;
	font-size: 20px;
	margin-top: 10px;
}

.product-info{
		margin-top: 50px;
}

/*********************************************
					VIEW
*********************************************/

.content-wrapper {
	max-width: 1140px;
	background: #fff;
	margin: 0 auto;
	margin-top: 25px;
	margin-bottom: 10px;
	border: 0px;
	border-radius: 0px;
}

.container-fluid{
	max-width: 1140px;
	margin: 0 auto;
}

.view-wrapper {
	float: right;
	max-width: 70%;
	margin-top: 25px;
}

.container {
	padding-left: 0px;
	padding-right: 0px;
	max-width: 100%;
}

/*********************************************
				ITEM 
*********************************************/

.service1-items {
	padding: 0px 0 0px 0;
	float: left;
	position: relative;
	overflow: hidden;
	max-width: 100%;
	height: 321px;
	width: 130px;
}

.service1-item {
	height: 107px;
	width: 120px;
	display: block;
	float: left;
	position: relative;
	padding-right: 20px;
	border-right: 1px solid #DDD;
	border-top: 1px solid #DDD;
	border-bottom: 1px solid #DDD;
}

.service1-item > img {
	max-height: 110px;
	max-width: 110px;
	opacity: 0.6;
	transition: all .2s ease-in;
	-o-transition: all .2s ease-in;
	-moz-transition: all .2s ease-in;
	-webkit-transition: all .2s ease-in;
}

.service1-item > img:hover {
	cursor: pointer;
	opacity: 1;
}

.service-image-left {
	padding-right: 50px;
}

.service-image-right {
	padding-left: 50px;
}

.service-image-left > center > img,.service-image-right > center > img{
	max-height: 155px;
}
  </style>
</head>
<body>
  <div class="container-fluid">
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
				<div class="col-md-12">
					<div class="product col-md-3 service-image-left">
                    
						<div align="center">
							<p><img src='<spring:url value="/uploads/${sessionScope.serachbike.image}"></spring:url>' alt="..."></p>
						</div>
					</div>
					
					<div class="container service1-items col-sm-2 col-md-2 pull-left">
						<center>
							<a id="item-1" class="service1-item">
								<img src='<spring:url value="/uploads/${sessionScope.serachbike.image}"></spring:url>' alt="...">
							</a>
							<a id="item-2" class="service1-item">
								<img src='<spring:url value="/uploads/${sessionScope.serachbike.image}"></spring:url>' alt="...">
							</a>
							<a id="item-3" class="service1-item">
								<img src='<spring:url value="/uploads/${sessionScope.serachbike.image}"></spring:url>' alt="...">
							</a>
						</center>
					</div>
				</div>
					
				<div class="col-md-7">
					<div class="product-title">Corsair GS600 600 Watt PSU</div>
					<div class="product-desc">The Corsair Gaming Series GS600 is the ideal price/performance choice for mid-spec gaming PC</div>
					<div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
					<hr>
					<div class="product-price">$ 1234.00</div>
					<div class="product-stock">In Stock</div>
					<hr>
					<div class="btn-group cart">
						<button type="button" class="btn btn-success">
							Add to cart 
						</button>
					</div>
					
					<form name="OptionMaker" action="/Online_Bike_Booking_Customizing/OrderController/order" method="post">
  
  
  <div class="container-fluid bg-3 text-center" >    
  <div class="row">
    <div class="col-sm-3">
    <div class="thumbnail">
      <img src='<spring:url value="/uploads/${sessionScope.serachbike.image}"></spring:url>' alt="...">
      <div class="caption">
        <h3>${sessionScope.serachbike.bikeName}</h3>
        <h3>${sessionScope.serachbike.price}</h3>
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
  <input type="submit" value="book"></input>
</form>

					
					
					
					<div class="btn-group wishlist">
						<button type="button" class="btn btn-danger">
							Add to wishlist 
						</button>
					</div>
				</div>
			</div> 
		</div>
		
		</div>
	</div>

</body>
</html>