<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@include file="categories.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div id="contenuCategories">
		<c:forEach var="produits" items="${produits}" >
	
		${produits.nom}              ${produits.prix}        <a href='ControleurAjoutPanier?id="${produits.id}"'>Ajouter au panier</a><br/><br/>
		</c:forEach>
		<br/><br/><br/>_____________________________________________________________<br/><br/><br/>
		<c:forEach var="panier" items="${panier}" >
	
		<c:out value="${panier.name}"/>   
		<c:out value="${panier.prix}"/>
		<c:out value="${panier.quantite}"/>  <br/>     
		</c:forEach>
	</div>

</body>
</html>