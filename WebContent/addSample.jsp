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

	<tr> <td>Storing Location</td> <td><input type="text" name="storingLocation" required></td> </tr>
	<tr> <td>Sample sequencer</td> <td><input type="email" id="sampleSequencer" name="sampleSequencer" required></td> </tr>
	<tr> <td>Sample stocker</td> <td><input type="email" id="sampleStocker" name="sampleStocker" required></td> </tr>
	<tr> <td>Sample uploader</td> <td><input type="email" id="sampleUploader" name="sampleUploader" required></td> </tr>
	<tr> <td>Sample identifier</td> <td><input type="email" id="sampleIdentifier" name="sampleIdentifier" required></td> </tr>
	<tr> <td>Sample collector</td> <td><input type="email" id="sampleCollector" name="sampleCollector" required></td> </tr>
	<tr> <td>Sample extractor</td> <td><input type="email" id="sampleExtractor" name="sampleExtractor" required></td> </tr>
	<tr> <td>Sample amplifier</td> <td><input type="email" id="sampleAmplifier" name="sampleAmplifier" required></td> </tr>
	<tr> <td>Sequencing method name (must be valid)</td> <td><input type="text" name="sequencingMethodName" required></td> </tr>
	<tr> <td>Amplification method name (must be valid)</td> <td><input type="text" name="amplificationMethodName" required></td> </tr>
	<tr> <td>Extraction method name (must be valid)</td> <td><input type="text" name="extractionMethodName" required></td> </tr>
	<tr> <td>Specimen storing ID (must be valid)</td> <td><input type="number" name="specimenStoringID" required></td> </tr>
	<tr> <td>Sequencing datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td> <td><input type="text" name="sequencingTimestamp" required></td> </tr>
	<tr> <td>Amplification datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td> <td><input type="text" name="amplificationTimestamp" required></td> </tr>
	<tr> <td>Extraction datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td> <td><input type="text" name="extractionTimestamp" required></td> </tr>
	<tr> <td>Primer codes</td> <td><input type="text" name="primerCodes" required></td> </tr>
	<tr> <td>Read direction</td> 
		<td><input type="radio" id="direction1" name="readDirection" value="Forward" required>
  			<label for="direction1">Forward</label>
  			<input type="radio" id="direction2" name="readDirection" value="Reverse">
  			<label for="direction2">Reverse</label> 
  		</td> 
  	</tr>
	<tr> <td>Sequence length</td> <td><input type="number" name="sequenceLength" min="0" required></td> </tr>
	<tr> <td>Marker</td> <td><input type="text" name="marker" required></td> </tr>
	<tr> <td>Primer description</td> <td><input type="text" name="primerDescription" required></td> </tr>
	<tr> <td>Sequence data</td> <td><input type="text" name="sequenceData" required></td> </tr>
	<tr> <td>Base calling file</td> <td><input type="text" name="baseCallingFile" required></td> </tr>

</table>
	<input type="BUTTON" VALUE="Back" onclick="window.location='mainMenu.jsp'"/>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>