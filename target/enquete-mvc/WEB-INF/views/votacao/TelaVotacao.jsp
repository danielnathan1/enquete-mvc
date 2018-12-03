<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela De Vota~cao</title>
</head>
<body>
<div>
	<h1>Lista de Candidatos</h1>
	<hr>
	<div>
		<spring:url value="/Candidato/cadastro" var="cadastro"/>
		<a class="btn btn-default" href="${cadastro }">Novo Candidato</a>
	</div>
	<hr>
	
	<div class="${message==null ? 'panel-default' : 'panel-success'}">
		
		<div class="panel-success">
			<span>${message==null ? '&nbsp;' :message}</span>
		</div>
		
		<table class="table table-striped table-condensed">
			<thead>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>NUMERO DO CANDIDATO</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach var="candidato" items="${candidatos}">
				<tr>
					<td>${candidato.id }</td>
					<td>${candidato.nome }</td>
					<td>${candidato.numero }
					<td>                       
						<spring:url value="/votar/resultado/${candidato.id }" var="voto"/>                        
						<a class="btn btn-info" href="${voto }" >VOTAR</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>

</body>
</html>