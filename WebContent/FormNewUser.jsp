<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario de nuevo usuario</title>
</head>
<body>

<form action="NewUserServlet">
	<input type="text" name="email" placeholder="Inserte aqui el email"/>
	<input type="text" name="name" placeholder="Inserte aqui el Nombre"/>
	<input type="password" name="password" placeholder="Inserte aqui el contraseña"/>
	<input type="password" name="password2" placeholder="Inserte aqui el contraseña otra vez"/>	
	<button type="submit">
		Create
	</button>
</form>

</body>
</html>