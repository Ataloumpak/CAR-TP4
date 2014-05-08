<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div>
        <h1>Récapitulatif du livre saisi:</h1>
        <p>Titre: <%= request.getParameter("titre") %></p>
        <p>Auteur: <%= request.getParameter("auteur") %></p>
        <p>Année: <%= request.getParameter("annee") %></p>
    </div>
</body>
</html>