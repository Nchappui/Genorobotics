<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Method</title>
</head>
<body>
<div align="center">
  <h1>New Method to add</h1>
  <form action="<%=request.getContextPath()%>/addMethod" method="post">
   <table style="with: 100%">
   <tr>
     <td>Method Name</td>
     <td><input type="text" name="methodName" /></td>
    </tr>
    <tr>
     <td>Method Description</td>
     <td><input type="text" name="methodDescription" /></td>
    </tr>
    <tr>
     <td>Method Type (Amplification / Extraction / Sequencing / Taxonomic / Collection)</td>
     <td><input type="text" name="methodType" /></td>
    </tr>

   </table>
   <input type="BUTTON" VALUE="Back" onclick="window.location='mainMenu.jsp'"/>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>