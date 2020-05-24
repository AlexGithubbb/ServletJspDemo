<%@page import="com.alexpower.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="salmon">

<h1>Your product: </h1> 
<% 
/* Product product =  (Product) request.getAttribute("product"); */

Product product= (Product) session.getAttribute("product");
%>

<p style="font-size:30px; color:white" >id: <%= product.getId() %></p><br>
<p style="font-size:30px; color:white" >product name :<%= product.getName() %></p><br>
<p style="font-size:30px; color:white" >product category: <%= product.getField()%></p>


	
	
</body>
</html>