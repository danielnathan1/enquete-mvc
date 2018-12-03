<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BEM VINDO A VOTAÇÃO</title>
</head>
<body>
	<hr>
	<div>
		<spring:url value="/TelaVotacao" var="Votar"/>
		<a class="btn btn-default" href="${cadastro }">Novo Candidato</a>
	</div>
	<hr>
</body>
</html>