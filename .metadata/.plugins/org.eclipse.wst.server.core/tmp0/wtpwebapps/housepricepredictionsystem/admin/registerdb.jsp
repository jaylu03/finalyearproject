<%@page import="java.math.BigInteger"%>
<%@page import="com.sun.glass.ui.CommonDialogs.Type"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%


Class.forName("com.mysql.jdbc.Driver");

Connection c = DriverManager.getConnection("jdbc:mysql://localhost/housepriceprediction","root","root");


Statement s= c.createStatement();

String fname = request.getParameter("first_name");

String lname = request.getParameter("last_name");

String email = request.getParameter("email");

String phone = request.getParameter("phoneno");

String passwordConfirm = request.getParameter("password-confirm");

String password = request.getParameter("password");

if(password.equals(passwordConfirm)){	
	phone = phone.replaceFirst("^0+(?!$)", "");
	
	s.executeUpdate("insert into users(firstname,lastname,email,phonenumber,password) values('"+fname+"','"+lname+"','"+email+"','"+phone+"','"+password+"')");
	response.sendRedirect("./login.jsp");
}
else{
	session.setAttribute("pass","false");
	response.sendRedirect("./register.jsp");
	
}



s.close();
c.close();


%>

</body>
</html>