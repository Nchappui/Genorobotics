<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tables</title>
</head>
<body>
	<div align="center">
		<h1>Tables</h1>


		<form action="<%=request.getContextPath()%>/seePersons" method="post">
			<input type="submit" value="Person table" />
		</form>
		<br>
		<br> <input type="BUTTON" VALUE="Back to main menu"
			onclick="window.location='mainMenu.jsp'" />


	</div>

</body>
</html>