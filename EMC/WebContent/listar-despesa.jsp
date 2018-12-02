<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Despesa</title>

<%@include file="header.jsp"%>
</head>
<%@include file="menu.jsp"%>
<body>
	<div class="container">
		<h1>Listar Despesa</h1>
		<div class="row">
			<div class="form-group col-md-8 col-md-offset-2">
				<table class="table table-striped">
					<tr>
						<th>Codigo</th>
						<th>Despesa</th>
						<th>NºProcesso</th>
						<th>Desc/Processo</th>
						<th>Data</th>
						<th>Valor</th>
						<th>Observação</th>
						<th></th>
						<th></th>

					</tr>

					<!-- column headers -->

					<c:forEach var="lan" items="${despesa}">
						<tr>
							<td>${lan.codLanD}</td>
							<td>${lan.tipoDesp.getStrTpDesp()}</td>
							<td>${lan.processo.getNumProc()}</td>
							<td>${lan.processo.getProcesso()}</td>
							<td><fmt:formatDate value="${lan.dtDesp.time}"
									pattern="dd/MM/yyyy" /></td>
							<td>${lan.vlDesp }</td>
							<td>${lan.obsDesp }</td>
							<td>
								<!-- Montando o destino do link --> <c:url
									value="processoServlet" var="link">
									<c:param name="acao" value="lanDesp" />
									<c:param name="numProc" value="${c.numProc}" />
									<c:param name="cli" value="${c.cliente.getRazao()}" />
								</c:url> <a href="${link}" class="btn btn-danger"> Lançar Despesa </a>
							</td>
							<td>
								<!-- Montando o destino do link de editar --> <c:url
									value="processoServlet" var="link2">
									<c:param name="acao" value="carregaDesp" />
									<c:param name="numProc" value="${c.numProc}" />
								</c:url> <a href="${link2}" class="btn btn-warning"> Consultar
									Despesa </a>
							</td>
						</tr>
					</c:forEach>

				</table>
			</div>
</body>
</html>