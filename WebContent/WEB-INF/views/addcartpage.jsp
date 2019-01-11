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

<body>
<div class="container">
    <div class="row">
        <div class="col-sm-12 col-md-10 col-md-offset-1">
          
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                        <th class="text-center">Price</th>
                        <th class="text-center">Total</th>
                        <th> </th>
                    </tr>
                </thead>
                <c:forEach var="list" items="${sessionScope.orderlistcart}">
               <form:form  modelAttribute="orderDetail" method="post">
                <tbody>
              
                
                    <tr>
                        <td class="col-sm-8 col-md-6">
                        <div class="media">
                            <a class="thumbnail pull-left" href="#"> <img class="media-object" src='<spring:url value="/uploads/${list.bikeStore.image}"></spring:url>' style="width: 72px; height: 72px;"> </a>
                            <div class="media-body">
                                <h4 class="media-heading"><a href="#">${list.bikeStore.bikeName}</a></h4>
                                <span>Status: </span><span class="text-success"><strong>In Stock</strong></span>
                            </div>
                        </div></td>
                        <td class="col-sm-1 col-md-1" style="text-align: center">
                        <input type="text" name="qty" class="form-control" id="qty" value="${list.qty}">
                        <input type="submit" formaction="/Online_Bike_Booking_Customizing/cart/updatecart?idparam=${list.bikeStore.bikeId}" value="update">
                        </td>
                        <td class="col-sm-1 col-md-1 text-center"><strong>${list.unitPrice}</strong></td>
                        <td class="col-sm-1 col-md-1 text-center"><strong>${list.price}</strong></td>
                        
                        <td class="col-sm-1 col-md-1">
                        <a href="/Online_Bike_Booking_Customizing/cart/remove?idparam=${list.bikeStore.bikeId}" class="btn btn-danger" value="Remove">
                           
                        Remove</a></td>
                    </tr>
                   
                </tbody>
                </form:form>
                </c:forEach>
                <tfoot>
                    <tr>
                        <td>   </td>
                        <td>   </td>
                        <td>   </td>
                        <td class="text-right"> Total<h3>${sessionScope.total_amount}</h3></td>
                    </tr>
                    <tr>
                        <td>   </td>
                        <td>   </td>
                        <td>   </td>
                        <td>
                        
                        <a href="/Online_Bike_Booking_Customizing/homepage/userhome"><button type="button" class="btn btn-default">
                            <span class="glyphicon glyphicon-shopping-cart"></span> Continue Shopping
                        </button></a></td>
                        <td>
                       <a href="/Online_Bike_Booking_Customizing/OrderController/check"> <button type="button" class="btn btn-success">
                            Checkout <span class="glyphicon glyphicon-play"></span>
                        </button></a></td>
                    </tr>
                </tfoot>
            </table>
   
          
        </div>
    </div>
</div>

</body>
</html>