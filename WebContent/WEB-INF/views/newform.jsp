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
<body>
<form:form  class="well form-horizontal" action="" method="post" modelAttribute="customer" id="contact_form">
 <div class="container">
 <fieldset>
               <legend><center><h2><b>Registration Form</b></h2></center></legend><br>

				 <div class="form-group">
				  <label class="col-md-4 control-label">First Name</label>  
				  <div class="col-md-4 inputGroupContainer">
				  <div class="input-group">
				  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				  <form:input path="firstName" class="form-control"/>
				  </div>
				  </div>
				  </div>
				  
				  <div class="form-group">
				  <label class="col-md-4 control-label">Last Name</label>  
				  <div class="col-md-4 inputGroupContainer">
				  <div class="input-group">
				  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				  <form:input path="lastName" class="form-control"/>
				  </div>
				  </div>
				  </div>
				  
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
					  <label class="col-md-4 control-label" >Confirm Password</label> 
					    <div class="col-md-4 inputGroupContainer">
					    <div class="input-group">
					  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
					  <form:input path="password" placeholder="Confirm Password" class="form-control" id="confirm" type="password"/>
					    </div>
					  </div>
					</div>
					
					<div class="form-group">
					  <label class="col-md-4 control-label">Mobile</label>  
					    <div class="col-md-4 inputGroupContainer">
					    <div class="input-group">
					        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
					  <form:input path="mobileNo" placeholder="(91+)" class="form-control" id="mobile" type="text"/>
					    </div>
					  </div>
					</div>
				  
				 
				  <div class="form-group"> 
				  <label class="col-md-4 control-label">Role</label>
				    <div class="col-md-4 selectContainer">
				    <div class="input-group">
				        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
				      <form:select path="role">
					<form:option value="0" label="--select--"></form:option>
					<form:option value="user" label="--user--"></form:option>
					<form:option value="admin" label="--admin--"></form:option>
					</form:select>
					  </div>
					</div>
					</div>
					
					<div class="form-group">
					  <label class="col-md-4 control-label"></label>
					  <div class="col-md-4"><br>
					    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-warning" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
					  </div>
					</div>
					
				  
  </fieldset>
 </div>
</form:form>
</body>
</html>