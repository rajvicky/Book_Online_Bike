<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="<spring:url value='/bootstrap/css/bootstrap.css'/>"
	type="text/css" />
	<link rel="stylesheet" href="<spring:url value='/bootstrap/css/bootstrap.min.css'/>"
	type="text/css" />
	<style>
#success_message{ display: none;};
body {
    background-color: lightblue;
};
</style>
</head>
<body style="padding-left: 100px;padding-right: 200px; padding-top: 100px; background-image:ur" >
<form:form  class="well form-horizontal" action="" method="post" modelAttribute="customer" id="contact_form">
 <div class="container">
 <fieldset>
               <legend><center><h2><b>Login Form</b></h2></center></legend><br>

				<h3>${requestScope.msg}</h3>  
				<h2>${requestScope.status}</h2>
				  <div class="form-group">
						  <label class="col-md-4 control-label">E-Mail</label>  
						    <div class="col-md-4 inputGroupContainer">
						    <div class="input-group">
						        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
						  <form:input path="email" placeholder="E-Mail Address" class="form-control" id="email" type="text"/>
						    </div>
						  </div>
						</div>
				  
				  
				  <div class="form-group">
					  <label class="col-md-4 control-label" >Password</label> 
					    <div class="col-md-4 inputGroupContainer">
					    <div class="input-group">
					  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
					  <form:password path="password" placeholder="Password" class="form-control" id="password" />
					    </div>
					  </div>
					</div>
				 
				  
					<div class="form-group">
					  <label class="col-md-4 control-label"></label>
					  <div class="col-md-4"><br>
					    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-warning" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspLOGIN <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
					  </div>
					</div>
  </fieldset>
 </div>
</form:form>
<a href="../Login/forget">Forget Password?</a>

</body>
</html>