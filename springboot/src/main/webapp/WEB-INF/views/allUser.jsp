<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div class="row">
	<c:forEach var="user" items="${list}"> 
		<div class="col-4 my-1">
			<div class="card">
				<img class="card-img-top" src="user.jpg" alt="Card image">
				<div class="card-body">
					<h4 class="card-title">${user.userEmail}</h4>
					<p class="card-text">
						<h5>userId:-${user.userId}</h5>
						<h6>user Email:-${user.userEmail}</h6>
					</p>
					<a href="#" class="btn btn-primary">See Profile</a>
				</div>
			</div>
		</div>
		</c:forEach>
	</div>

</body>
</html>