<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a specimen</title>
</head>
<body>
	<div align="center">
		<h1>New Specimen to add</h1>
		<form action="<%=request.getContextPath()%>/addspecimen" method="post">
			<table style="with: 100%">
				<tr>
					<td>Extra Informations</td>
					<td><input type="text" name="specimenExtraInfos" /></td>
				</tr>
				<tr>
					<td>Measurement types</td>
					<td><input type="text" name="specimenMeasurementType" /></td>
				</tr>
				<tr>
					<td>Image URL</td>
					<td><input type="url" name="specimenImage" required></td>
				</tr>
				<tr>
					<td>Image timestamp (format: YYYY-MM-DD, for example
						2021-01-01)</td>
					<td><input type="text" name="specimenImageTimestamp" required></td>
				</tr>
				<tr>
					<td>Image description</td>
					<td><input type="text" name="specimenImageDescription" /></td>
				</tr>
				<tr>
					<td>Image copyright</td>
					<td><input type="text" name="specimenImageCopyright" required></td>
				</tr>
				<tr>
					<td>Host</td>
					<td><input type="text" name="specimenHost" required></td>
				</tr>
				<tr>
					<td>Sex</td>
					<td><input type="radio" id="sex1" name="specimenSex"
						value="Male" required> <label for="sex1">Male</label></td>
					<td><input type="radio" id="sex2" name="specimenSex"
						value="Female"> <label for="sex2">Female</label></td>
					<td><input type="radio" id="sex3" name="specimenSex"
						value="Hermaphrodite"> <label for="sex3">Hermaphrodite</label></td>
					<td><input type="radio" id="sex4" name="specimenSex"
						value="None"> <label for="sex4">None</label></td>

				</tr>
				<tr>
					<td>Life stage</td>
					<td><input type="radio" id="life1" name="specimenLifeStage"
						value="Adult" required> <label for="life1">Adult</label></td>
					<td><input type="radio" id="life2" name="specimenLifeStage"
						value="Immature"> <label for="life2">Immature</label></td>
				</tr>
				<tr>
					<td>Reproduction (Sexual/Asexual/Cyclic/Pathogen)</td>
					<td><input type="radio" id="rep1" name="specimenReproduction"
						value="Sexual" required> <label for="rep1">Sexual</label></td>
					<td><input type="radio" id="rep2" name="specimenReproduction"
						value="Asexual" required> <label for="rep2">Asexual</label></td>
					<td><input type="radio" id="rep3" name="specimenReproduction"
						value="Cyclic" required> <label for="rep3">Cyclic</label></td>
					<td><input type="radio" id="rep4" name="specimenReproduction"
						value="Pathogen" required> <label for="rep4">Pathogen</label></td>
				</tr>
				<tr>
					<td>Collection method name (Must already be in the collection
						methods table)</td>
					<td><input type="text" name="specimenCollectionMethodName"
						required></td>
				</tr>
				<tr>
					<td>Taxonomic method name (Must already be in the taxonomic
						methods table)</td>
					<td><input type="text" name="specimenTaxonomicMethodName"
						required></td>
				</tr>
				<tr>
					<td>Taxonomic datetime (format: YYYY-MM-DD HH:MM:SS, for
						example 2021-01-01 12:00:00)</td>
					<td><input type="text" name="specimenTaxonomicTimestamp"
						required></td>
				</tr>
				<tr>
					<td>Collection datetime (format: YYYY-MM-DD HH:MM:SS, for
						example 2021-01-01 12:00:00)</td>
					<td><input type="text" name="specimenCollectionTimestamp"
						required></td>
				</tr>
				<tr>
					<td>Taxonomy (format: Domain; Kingdom; Phylum; Class; Order;
						Family; Genus; Species)</td>
					<td><input type="text" name="specimenTaxonomyDomain" required></td>
					<td><input type="text" name="specimenTaxonomyKingdom" required></td>
					<td><input type="text" name="specimenTaxonomyPhylum" required></td>
					<td><input type="text" name="specimenTaxonomyClass" required></td>
					<td><input type="text" name="specimenTaxonomyOrder" required></td>
					<td><input type="text" name="specimenTaxonomyFamily" required></td>
					<td><input type="text" name="specimenTaxonomyGenus" required></td>
					<td><input type="text" name="specimenTaxonomySpecies" required></td>
				</tr>
				<tr>
					<td>Collection area (format: Continent/Ocean; Country;
						State/Province; Region; Sector)</td>
					<td><input type="text" name="specimenCollectionAreaContinent"
						required></td>
					<td><input type="text" name="specimenCollectionAreaCountry"
						required></td>
					<td><input type="text" name="specimenCollectionAreaState"
						required></td>
					<td><input type="text" name="specimenCollectionAreaRegion"
						required></td>
					<td><input type="text" name="specimenCollectionAreaSector"
						required></td>
				</tr>
				<tr>
					<td>Collection elevation/depth</td>
					<td><input type="number" name="specimenElevation" required></td>
				</tr>
				<tr>
					<td>Collection GPS coordinates</td>
					<td><input type="text" name="specimenGPSX" required></td>
					<td><input type="text" name="specimenGPSY" required></td>
				</tr>

			</table>
			<input type="BUTTON" VALUE="Back"
				onclick="window.location='mainMenu.jsp'" /> <input type="submit"
				value="Submit" />
		</form>
	</div>

</body>
</html>