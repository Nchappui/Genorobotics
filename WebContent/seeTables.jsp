<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tables</title>
</head>
<body>
	
		<h1>Tables</h1>
		<form action="<%=request.getContextPath()%>/seeMethods" method="post">
			<input type="submit" value="Methods table" />
		</form>
		<br>
		<form action="<%=request.getContextPath()%>/seeSamples" method="post">
			<input type="submit" value="Sample table" />
		</form>
		<br>
		<form action="<%=request.getContextPath()%>/seeSpecimens" method="post">
			<input type="submit" value="Specimen table" />
		</form>
		<br>
		<form action="<%=request.getContextPath()%>/seePersons" method="post">
			<input type="submit" value="Persons table" />
		</form>
		<br>
		<br>
	<input type="BUTTON" VALUE="Back"
		onclick="window.location='mainMenu.jsp'"/>




</body>
</html>