<%@page import="persons.PersonBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Person List</title>
</head>
<body>
	<h1>Displaying Person List</h1>
	<table border="1">
		<tr bgcolor="00FF7F">
			<th><b>Email</b></th>
			<th><b>Full name</b></th>
		</tr>
		<%-- Fetching the attributes of the request object 
			which was previously set by the servlet 
			"StudentServlet.java" 
		--%>
		<%! @SuppressWarnings("unchecked") %>
		<%ArrayList<PersonBean> std = 
			(ArrayList<PersonBean>)request.getAttribute("personsData"); 
		for(PersonBean s:std){%>
		<%-- Arranging data in tabular form 
		--%>
		<tr>
			<td><%=s.getEmail()%></td>
			<td><%=s.getFullname()%></td>
		</tr>
		<%}%>
	</table>
	<hr />
	<input type="BUTTON" VALUE="Back to main menu"
		onclick="window.location='mainMenu.jsp'" />
</body>
</html>
