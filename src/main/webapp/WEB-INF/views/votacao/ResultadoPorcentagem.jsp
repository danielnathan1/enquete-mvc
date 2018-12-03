<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado Detalhado</title>
</head>
<body>
	<h1>RESULTADO DETALHADO</h1>
	<h2>%${enquete.totalVotos }%</h2>
	<table class="table table-striped table-condensed">
		<thead>
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>NUMERO DO CANDIDATO</th>
				<th>VOTOS</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="candidato" items="${candidatos}">
				<tr>
					<td>${candidato.id }</td>
					<td>${candidato.nome }</td>
					<td>${candidato.numero }</td>
					<td>${candidato.numeroDeVotos }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<td><spring:url value="/" var="voltar" /> <a class="btn btn-info"
		href="${voltar }">VOLTAR</a> <spring:url
			value="/votar/resultado/detalhado" var="detalhe" /> <a
		class="btn btn-info" href="${detalhe }">detalhe</a></td>
	</div>
</body>
</html>