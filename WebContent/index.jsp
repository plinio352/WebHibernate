<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="principal.ControleDao"%>
<%@page import="principal.TbTeste"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem Vindo</h1> 
	<hr>
<%
	TbTeste t = new TbTeste();
	t.setIdade(12);
	t.setNome("Manuel");
	t.setSalario(45.0);
	
	
	ControleDao cd = new ControleDao();      
	cd.salvar(t);   
	
	
%>

	
</body>
</html>