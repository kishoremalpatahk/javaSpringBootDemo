<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%@include file="links.jsp"%>
</head>
<body>
	<%@include file="menu.jsp"%>
	<div class="container">
		<c:if test="${not empty msg}">
			<div class="alert alert-success alert-dismissible fade show"
				role="alert">
				<strong>Success!</strong> ${msg }
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
		</c:if>
		<c:if test="${not empty errmsg}">
			<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<strong>Error!</strong> ${errmsg }
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
		</c:if>
		<div class="card">
			<div class="card-header">
				<h1>Registration Page</h1>
			</div>
			<div class="card-body">
				<form:form method="post">
					<div class="form-group">
						<form:label path="userEmail">Email address:</form:label>
						<form:input type="text" path="userEmail" class="form-control"
							placeholder="Enter email" />
						<form:errors path="userEmail" class="text-danger"></form:errors>
					</div>
					<div class="form-group">
						<form:label path="pass">Password:</form:label>
						<form:input type="password" path="pass" class="form-control"
							placeholder="Enter password" />
					</div>
					<button type="submit" class="btn btn-primary">Register</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>