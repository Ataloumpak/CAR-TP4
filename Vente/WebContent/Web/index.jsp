<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projet de CAR</title>
</head>
<body>
	<form action="../Login" method="post">
		<label for="login">Login</label> <input type="text" name="login">
		<label for="login">Mot de passe</label> <input type="text" name="pwd">
		<input type="submit" value="Connexion">
	</form>
	<form action="../inscrire" method="post">
		<label for="login">Login</label> <input type="text" name="login">
		<label for="login">Mot de passe</label> <input type="text" name="pwd">
		<input type="submit" value="Inscription">
	</form>
</body>
</html>