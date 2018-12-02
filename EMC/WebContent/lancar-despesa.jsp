<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lançar Despesa</title>
<%@include file="header.jsp"%>
</head>
<%@include file="menu.jsp"%>
<body>
	<div class="container">
		<h1>Lançar Despesa</h1>
		<%@include file="mensagens.jsp"%>
		<form action="DespesaServlet" method="get">
			<input type="hidden" name="acao" value="addDesp">
			<div class="form-group col-md-4 col-md-offset-1">
				<label for="numProc">Numero Processo:</label> <input type="text"
					name="numeroProcesso" value="${numPC}" id="numProc"
					class="form-control" readonly>
			</div>
			<div class="form-group col-md-4 col-md-offset-1">
				<label for="nCliente">Cliente:</label> <input type="text"
					name="cliente" value="${cliRazao}" id="nCliente"
					class="form-control" readonly>
			</div>
			<input type="hidden" name="acao" value="lancaDesp">
			<div class="form-group col-md-4 col-md-offset-1">
				<label for="desp">Despesa</label> <select name="despesa" id="desp"
					class="form-control">
					<option>Selecione</option>
					<c:forEach items="${despesas}" var="td">
						<option value="${td.codTpDesp}">${td.strTpDesp}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group col-md-4 col-md-offset-1">
				<label for="data">Data:</label> <input type="date" name="data"
					id="data" class="form-control">
			</div>
			<div class="form-group col-md-4 col-md-offset-1">
				<label for="valor">Valor:</label> <input type="text" name="valor"
					id="valor" class="form-control">
			</div>
			<div class="form-group col-md-4 col-md-offset-1">
				<textarea rows="8" cols="30" name="obs" id="obs"
					placeholder="Observações"></textarea>
			</div>
			<div class="form-group col-md-3 col-md-offset-2">
				<input type="submit" value="Salvar" class="btn btn-sucess">
			</div>
		</form>
	</div>
</body>
</html>