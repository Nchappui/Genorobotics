<%@page import="sample.SampleBean"%> 
<%@page import="java.util.ArrayList"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Sample List</title> 
</head> 
<body> 
	<h1>Displaying Sample List</h1> 
	<table border ="1"> 
		<tr bgcolor="00FF7F"> 
		<th><b>Sample ID</b></th> 
		<th><b>Storing Location</b></th> 
		<th><b>Sample sequencer</b></th>
		<th><b>Sample stocker</b></th>
		<th><b>Sample uploader</b></th>
		<th><b>Sample identifier</b></th>
		<th><b>Sample collector</b></th>
		<th><b>Sample extractor</b></th>
		<th><b>Sample amplifier</b></th>
		<th><b>Sequencing method name</b></th>
		<th><b>Amplification method name</b></th>
		<th><b>Extraction method name</b></th>
		<th><b>Specimen storing ID</b></th>
		<th><b>Sequencing datetime</b></th>
		<th><b>Amplification datetime</b></th>
		<th><b>Extraction datetime</b></th>
		<th><b>Primer codes</b></th>
		<th><b>Read direction</b></th>
		<th><b>Sequence length</b></th>
		<th><b>Marker</b></th>
		<th><b>Primer description</b></th>
		<th><b>Sequence data</b></th>
		<th><b>Base calling file</b></th>
		</tr> 
		<%-- Fetching the attributes of the request object 
			which was previously set by the servlet 
			"StudentServlet.java" 
		--%> 
		<%! @SuppressWarnings("unchecked") %>
		<%ArrayList<SampleBean> std = 
			(ArrayList<SampleBean>)request.getAttribute("samplesData"); 
		for(SampleBean s:std){%> 
		<%-- Arranging data in tabular form 
		--%> 
			<tr> 
				<td><%=s.getSampleID()%></td> 
				<td><%=s.getStoringLocation()%></td>
				<td><%=s.getSampleSequencer()%></td>
				<td><%=s.getSampleStocker()%></td>
				<td><%=s.getSampleUploader()%></td>
				<td><%=s.getSampleIdentifier()%></td>
				<td><%=s.getSampleCollector()%></td>
				<td><%=s.getSampleExtractor()%></td>
				<td><%=s.getSampleAmplifier()%></td>
				<td><%=s.getSequencingMethodName()%></td>
				<td><%=s.getAmplificationMethodName()%></td>
				<td><%=s.getExtractionMethodName()%></td>
				<td><%=s.getSpecimenStoringID()%></td>
				<td><%=s.getSequencingTimestamp()%></td>
				<td><%=s.getAmplificationTimestamp()%></td>
				<td><%=s.getExtractionTimestamp()%></td>
				<td><%=s.getPrimerCodes()%></td>
				<td><%=s.getReadDirection()%></td>
				<td><%=s.getSequenceLength()%></td> 
				<td><%=s.getMarker()%></td> 
				<td><%=s.getPrimerDescription()%></td> 
				<td><%=s.getSequenceData()%></td> 
				<td><%=s.getBaseCallingFile()%></td> 
			</tr> 
			<%}%> 
		</table> 
		<hr/> 
		<input type="BUTTON" VALUE="Back to main menu" onclick="window.location='mainMenu.jsp'"/>
	</body> 
</html> 
