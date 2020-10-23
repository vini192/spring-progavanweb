<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<form method="POST">
		<p>Doletas: <input type="text" name="dolar"></p>
		<p><button type="submit" value="enviar">Enviar</button>
		<p>${mensagem}</p>
	</form>
	
</body>
</html>