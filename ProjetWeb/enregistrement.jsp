<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="template.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="Post" action='ControleurEnregistrement' class="formClient">
		<p><input type="text" name="nom" id="nom" placeholder="nom"/></p>
		<p><input type="text" name="prenom" id="prenom" placeholder="prénom"/></p>
		<p><input type="text" name="email" id="email" placeholder="adresse e-mail"/></p>
		<p><input type="text" name="adresse" id="adresse" placeholder="adresse postale"/></p>
		<p><input type="text" name="numero" id="numero" placeholder="numéro de téléphone" /></p>
		<button type="submit">envoyer </button>
	</form>
	

</body>
</html>