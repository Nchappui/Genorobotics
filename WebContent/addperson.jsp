<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a person</title>
</head>
<body>
<div align="center">
  <h1>New Person to add</h1>
  <form action="<%=request.getContextPath()%>/addperson" method="post">
   <table style="with: 100%">
    <tr>
     <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>Full name</td>
     <td><input type="text" name="fullname" /></td>
    </tr>

   </table>
   <input type="BUTTON" VALUE="Back" onclick="window.location='mainMenu.jsp'"/>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>