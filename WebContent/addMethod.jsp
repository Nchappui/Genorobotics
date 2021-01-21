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
     <td><input type="text" name="methodName" required></td>
    </tr>
    <tr>
     <td>Method Description</td>
     <td><input type="text" name="methodDescription" required maxlength=999/></td>
    </tr>
    <tr>
     <td>Method Type</td>
     	<td><input type="radio" id="method1" name="methodType" value="Amplification" required>
  		<label for="method1">Amplification</label>
  		<input type="radio" id="method2" name="methodType" value="Extraction">
  		<label for="method2">Extraction</label>
  		<input type="radio" id="method3" name="methodType" value="Sequencing">
  		<label for="method3">Sequencing</label>
  		<input type="radio" id="method4" name="methodType" value="Taxonomic">
  		<label for="method4">Taxonomic</label>
  		<input type="radio" id="method5" name="methodType" value="Collection">
  		<label for="method5">Collection</label></td>
    </tr>

   </table>
   <input type="BUTTON" VALUE="Back" onclick="window.location='mainMenu.jsp'"/>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>