<%@page import="specimen.SpecimenBean"%> 
<%@page import="java.util.ArrayList"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Specimen List</title> 
</head> 
<body> 
	<h1>Displaying Specimen List</h1> 
	<table border ="1"> 
		<tr bgcolor="00FF7F"> 
		<th><b>Specimen ID</b></th> 
		<th><b>Extra Informations</b></th> 
		<th><b>Measurement types</b></th>
		<th><b>Image URL</b></th>
		<th><b>Image timestamp</b></th>
		<th><b>Image description</b></th>
		<th><b>Image copyright</b></th>
		<th><b>Host</b></th>
		<th><b>Sex</b></th>
		<th><b>Life stage</b></th>
		<th><b>Reproduction</b></th>
		<th><b>Collection method name</b></th>
		<th><b>Taxonomic method name</b></th>
		<th><b>Taxonomic datetime</b></th>
		<th><b>Collection datetime</b></th>
		<th><b>Taxonomy</b></th>
		<th><b>Collection area</b></th>
		<th><b>Collection elevation/depth</b></th>
		<th><b>Collection GPS coordinates</b></th>
		</tr> 
		<%-- Fetching the attributes of the request object 
			which was previously set by the servlet 
			"StudentServlet.java" 
		--%> 
		<%! @SuppressWarnings("unchecked") %>
		<%ArrayList<SpecimenBean> std = 
			(ArrayList<SpecimenBean>)request.getAttribute("specimensData"); 
		for(SpecimenBean s:std){%> 
		<%-- Arranging data in tabular form 
		--%> 
			<tr> 
				<td><%=s.getSpecimenID()%></td> 
				<td><%=s.getExtraInfos()%></td>
				<td><%=s.getMeasurementType()%></td>
				<td><%=s.getImage()%></td>
				<td><%=s.getImageTimestamp()%></td>
				<td><%=s.getImageDescription()%></td>
				<td><%=s.getImageCopyright()%></td>
				<td><%=s.getHost()%></td>
				<td><%=s.getSex()%></td>
				<td><%=s.getLifeStage()%></td>
				<td><%=s.getReproduction()%></td>
				<td><%=s.getCollectionMethodName()%></td>
				<td><%=s.getTaxonomicMethodName()%></td>
				<td><%=s.getTaxonomicTimestamp()%></td>
				<td><%=s.getCollectionTimestamp()%></td>
				<td><%=s.getCollectionTaxonomy()%></td> 
				<td><%=s.getCollectionArea()%></td> 
				<td><%=s.getCollectionElevation()%></td>
				<td><%=s.getCollectionGPSX()%><%=s.getCollectionGPSY()%></td>
				
			</tr> 
			<%}%> 
		</table> 
		<hr/> 
		<input type="BUTTON" VALUE="Back to main menu" onclick="window.location='mainMenu.jsp'"/>
	</body> 
</html> 
