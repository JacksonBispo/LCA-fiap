<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Processo</title>
<%@include file="header.jsp"%>
</head>
<body>
	<%@include file="menu.jsp"%>
	<div class="container">
		<form action="processoServlet" method="get">
			<h1>Listar Processos</h1>
			<div class="form-group col-md-6 col-md-offset-2">
				<input type="hidden" name="acao" value="buscar"> <label
					for="nProcesso">Numero do processo:</label> <input type="text"
					name="numeroProcesso" id="nProcesso" class="form-control">
			</div>
			<div class="form-group col-md-3 col-md-offset-2">
				<input type="submit" value="buscar" class="btn btn-sucess">
			</div>
		</form>
		<div class="row">
			<div class="form-group col-md-8 col-md-offset-2">
				<table class="table table-striped">
					<tr>
						<th>Código</th>
						<th>Descriçao</th>
						<th>Cliente</th>
						<th></th>
						<th></th>
					</tr>
					<c:forEach var="c" items="${processo}">
						<tr>
							<td>${c.numProc}</td>
							<td>${c.processo}</td>
							<td>${c.cliente.getRazao()}</td>
							<c:if test="${ac=='despesa'}">
								<td>
									<!-- Montando o destino do link --> <c:url
										value="DespesaServlet" var="link">
										<c:param name="acao" value="lanDesp" />
										<c:param name="numProc" value="${c.numProc}" />
										<c:param name="cli" value="${c.cliente.getRazao()}" />
									</c:url> <a href="${link}" class="btn btn-danger">Lançar Despesa</a>
								</td>
								<td>
									<!-- Montando o destino do link de editar --> <c:url
										value="DespesaServlet" var="link2">
										<c:param name="acao" value="listar" />
										<c:param name="numProc" value="${c.numProc}" />
									</c:url> <a href="${link2}" class="btn btn-warning"> Consultar
										Despesa </a>
								</td>
							</c:if>
							<c:if test="${ac=='honorario'}">
								<td>
									<!-- Montando o destino do link --> <c:url
										value="HonorarioServlet" var="link">
										<c:param name="acao" value="lanDesp" />
										<c:param name="numProc" value="${c.numProc}" />
										<c:param name="cli" value="${c.cliente.getRazao()}" />
									</c:url> <a href="${link}" class="btn btn-danger">Lançar Honorario</a>
								</td>
								<td>
									<!-- Montando o destino do link de editar --> <c:url
										value="HonorarioServlet" var="link2">
										<c:param name="acao" value="listar" />
										<c:param name="numProc" value="${c.numProc}" />
									</c:url> <a href="${link2}" class="btn btn-warning"> Consultar Honorario </a>
								</td>
							</c:if>
						</tr>
					</c:forEach>

				</table>
			</div>
		</div>

	</div>
</body>
</html>