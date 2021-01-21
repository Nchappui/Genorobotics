<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a sample</title>
</head>
<body>
<div align="center">
  <h1>New Sample to add</h1>
  <form action="<%=request.getContextPath()%>/addsample" method="post">
   <table style="with: 100%">

	<tr> <td>Storing Location</td> <td><input type="text" name="storingLocation" /></td> </tr>
	<tr> <td>Sample sequencer</td> <td><input type="text" name="sampleSequencer" /></td> </tr>
	<tr> <td>Sample stocker</td> <td><input type="text" name="sampleStocker" /></td> </tr>
	<tr> <td>Sample uploader</td> <td><input type="text" name="sampleUploader" /></td> </tr>
	<tr> <td>Sample identifier</td> <td><input type="text" name="sampleIdentifier" /></td> </tr>
	<tr> <td>Sample collector</td> <td><input type="text" name="sampleCollector" /></td> </tr>
	<tr> <td>Sample extractor</td> <td><input type="text" name="sampleExtractor" /></td> </tr>
	<tr> <td>Sequencing method name (must be valid)</td> <td><input type="text" name="sequencingMethodName" /></td> </tr>
	<tr> <td>Amplification method name (must be valid)</td> <td><input type="text" name="amplificationMethodName" /></td> </tr>
	<tr> <td>Extraction method name (must be valid)</td> <td><input type="text" name="extractionMethodName" /></td> </tr>
	<tr> <td>Specimen storing ID (must be valid)</td> <td><input type="text" name="specimenStoringID" /></td> </tr>
	<tr> <td>Sequencing datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td> <td><input type="text" name="sequencingTimestamp" /></td> </tr>
	<tr> <td>Amplification datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td> <td><input type="text" name="amplificationTimestamp" /></td> </tr>
	<tr> <td>Extraction datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td> <td><input type="text" name="extractionTimestamp" /></td> </tr>
	<tr> <td>Primer codes</td> <td><input type="text" name="primerCodes" /></td> </tr>
	<tr> <td>Read direction (0 is left to right and 1 is right to left)</td> <td><input type="text" name="readDirection" /></td> </tr>
	<tr> <td>Sequence length</td> <td><input type="text" name="sequenceLength" /></td> </tr>
	<tr> <td>Marker</td> <td><input type="text" name="marker" /></td> </tr>
	<tr> <td>Primer description</td> <td><input type="text" name="primerDescription" /></td> </tr>
	<tr> <td>Sequence data</td> <td><input type="text" name="sequenceData" /></td> </tr>
	<tr> <td>Base calling file</td> <td><input type="text" name="baseCallingFile" /></td> </tr>

</table>
	<input type="BUTTON" VALUE="Back" onclick="window.location='mainMenu.jsp'"/>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>