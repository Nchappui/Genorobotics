<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML>
<HEAD>
<meta charset="ISO-8859-1">
<TITLE>Genorobotics</TITLE>
</HEAD>
<BODY>
	
	<h1><img src="images/genorobotics.jpg" width="100" height="100"> Genorobotics database </h1>
	
	
	<form>
		<table style="with: 200%" border=1 cellpadding="5">

			<tr>
				<td><input type="BUTTON" VALUE="Add a new method"
					onclick="window.location='addMethod.jsp'" /></td>
			</tr>
			<tr>
				<td><input type="BUTTON" VALUE="Add a new sample"
					onclick="window.location='addSample.jsp'" /></td>
			</tr>
			<tr>
				<td><input type="BUTTON" VALUE="Add a new specimen"
					onclick="window.location='addSpecimen.jsp'" /></td>
			</tr>
			<tr>
				<td><input type="BUTTON" VALUE="Add a new person"
					onclick="window.location='addperson.jsp'" /></td>
			</tr>
			<tr>
				<td><input type="BUTTON" VALUE="See tables"
					onclick="window.location='seeTables.jsp'" /></td>
			</tr>
		</table>

	</form>


</BODY>
</HTML>