<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="template.jsp" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="categories">
	
		<div id="menu">
			<div class="vertical_menu">
				<p id="titre_categories">Sélectionner votre catégorie</p>
		
					<c:forEach var="categorie" items="${categorie}" >
					
					<a href='ControleurProduit?categorie="${categorie.id}"'>
					${categorie.id}
					<img src=${categorie.image} class="image_categories">
					${categorie.nom}<br/><br/>
					</c:forEach>
		<c:forEach var="panier" items="${panier}" >
	
		<c:out value="${panier.name}"/>   
		<c:out value="${panier.prix}"/>
		<c:out value="${panier.quantite}"/>  <br/>     
		</c:forEach>
				 </a>
			</div>
		</div>
	 </div>

</body>
</html>