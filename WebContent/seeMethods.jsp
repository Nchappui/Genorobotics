<%@page import="methods.MethodBean"%> 
<%@page import="java.util.ArrayList"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Method List</title> 
</head> 
<body> 
	<h1>Displaying Method List</h1> 
	<table border ="1"> 
		<tr bgcolor="00FF7F"> 
		<th><b>Method Name</b></th> 
		<th><b>Method Description</b></th>
		<th><b>Method Type</b></th>  
		</tr> 
		<%-- Fetching the attributes of the request object 
			which was previously set by the servlet 
			"StudentServlet.java" 
		--%> 
		<%! @SuppressWarnings("unchecked") %>
		<%ArrayList<MethodBean> std = 
			(ArrayList<MethodBean>)request.getAttribute("methodsData"); 
		for(MethodBean s:std){%> 
		<%-- Arranging data in tabular form 
		--%> 
			<tr> 
				<td><%=s.getMethodName()%></td> 
				<td><%=s.getMethodDescription()%></td>
				<td><%=s.getMethodType()%></td>
			</tr> 
			<%}%> 
		</table> 
		<hr/> 
		<input type="BUTTON" VALUE="Back to main menu" onclick="window.location='mainMenu.jsp'"/>
	</body> 
</html> 
