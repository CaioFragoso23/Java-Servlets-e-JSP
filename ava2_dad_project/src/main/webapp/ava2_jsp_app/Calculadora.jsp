<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculadora (Página JSP))</title>
</head>
<body>
	<!-- Definindo variáveis para pegar os erros das validações -->
	
	<%
	String erroV1      = (String) request.getAttribute("erroV1");
	String erroV2      = (String) request.getAttribute("erroV2");
	String erroDivide0 = (String) request.getAttribute("erroDivide0");
	
	String resultado   = (String) request.getAttribute("resultado");
	
	if(erroV1 == null){
		erroV1 = "";
	}
	
	if(erroV2 == null){
		erroV2 = "";
	}
	
	if(erroDivide0 == null){
		erroDivide0 = "";
	}
	
	if(resultado == null){
		resultado = "";
	}
	
	%>
	

	<form action="../Calculo" method="POST">
		<!--Valor 1 -->
		<div>
			<label>Valor 1:</label>
			<input type="text" name="valor1" >
			<span>
	<%= erroV1 %>
			</span>
		</div>
		
		<!--Valor 2 -->
		<div>
			<label>Valor 2:</label>
			<input type="text" name="valor2" >
			<%= erroV2 %>
		</div>
		
		<!--Operação Matemática  -->
		<div>
			<label>Op:</label>
			<select name="operacao" >
				<option value='+'> + </option>
				<option value='-'> - </option>
				<option value='*'> * </option>
				<option value='/'> / </option>
			</select>
		</div>
		<button type="submit" >Calcular</button>
	</form>
 	<%	if (!resultado.equals("")) { %>
		<h2 > Expressão: <%= resultado %></h2>
	<% } %>
</body>
</html>