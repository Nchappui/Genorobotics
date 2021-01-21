<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<HTML>
    <HEAD>
    	<meta charset="ISO-8859-1">
        <TITLE>Genorobotics</TITLE>
    </HEAD>
	<BODY>
        <div align="center">
        	<h1>Genorobotics</h1>
        	<form action="<%=request.getContextPath()%>/mainMenu" method="post">
      			<table style="with: 100%">
      			
      			<INPUT TYPE="HIDDEN" NAME="buttonName" >
      			<tr>
     				<td><input type="BUTTON" VALUE="add a new method" onclick="window.location='addMethod.jsp'"/></td>
    			</tr>
    			<tr>
     				<td><input type="BUTTON" VALUE="add a new sample" onclick="window.location='addSample.jsp'"/></td>
    			</tr>
    			<tr>
     				<td><input type="BUTTON" VALUE="add a new specimen" onclick="window.location='addSpecimen.jsp'"/></td>
    			</tr>
    			<tr>
     				<td><input type="BUTTON" VALUE="add a new person" onclick="window.location='addperson.jsp'"/></td>
    			</tr>
    			<tr>
     				<td><input type="BUTTON" VALUE="see tables" /></td>
    			</tr>
      			</table>
      			
      		</form>
 		</div>
 		
    </BODY>
</HTML>