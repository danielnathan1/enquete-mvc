<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<h1>Lista de Candidatos</h1>
	<hr>
	<div>
		<spring:url value="/usuario/cadastro" var="cadastro"/>
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
					<td>
						<spring:url value="/usuario/update/${candidato.id }" var="update"/>                        
						<a class="btn btn-info" href="${update }" >Editar</a>
						<spring:url value="/usuario/delete/${candidato.id }" var="delete"/>
						<a class="btn btn-danger" href="${delete }">Excluir</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>

</body>
</html>