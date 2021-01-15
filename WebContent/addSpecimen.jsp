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
     <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
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
     <td><input type="text" name="specimenImage" /></td>
    </tr>
    <tr>
     <td>Image timestamp (format: YYYY-MM-DD, for example 2021-01-01)</td>
     <td><input type="text" name="specimenImageTimestamp" /></td>
    </tr>
    <tr>
     <td>Image description</td>
     <td><input type="text" name="specimenImageDescription" /></td>
    </tr>
    <tr>
     <td>Image copyright</td>
     <td><input type="text" name="specimenImageCopyright" /></td>
    </tr>
    <tr>
     <td>Host</td>
     <td><input type="text" name="specimenHost" /></td>
    </tr>
    <tr>
     <td>Sex (Male/Female/Hermaphrodite/None)</td>
     <td><input type="text" name="specimenSex" /></td>
    </tr>
    <tr>
     <td>Life stage (Adult/Immature)</td>
     <td><input type="text" name="specimenLifeStage" /></td>
    </tr>
    <tr>
     <td>Reproduction (Sexual/Asexual/Cyclic/Pathogen)</td>
     <td><input type="text" name="specimenReproduction" /></td>
    </tr>
    <tr>
     <td>Collection method name (Must already be in the collection methods table)</td>
     <td><input type="text" name="specimenCollectionMethodName" /></td>
    </tr>
    <tr>
     <td>Taxonomic method name (Must already be in the taxonomic methods table)</td>
     <td><input type="text" name="specimenTaxonomicMethodName" /></td>
    </tr>
    <tr>
     <td>Taxonomic datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td>
     <td><input type="text" name="specimenTaxonomicTimestamp" /></td>
    </tr>
    <tr>
     <td>Collection datetime (format: YYYY-MM-DD HH:MM:SS, for example 2021-01-01 12:00:00)</td>
     <td><input type="text" name="specimenCollectionTimestamp" /></td>
    </tr>
    <tr>
     <td>Taxonomy (format: Domain; Kingdom; Phylum; Class; Order; Family; Genus; Species)</td>
     <td><input type="text" name="specimenTaxonomyDomain" /></td>
     <td><input type="text" name="specimenTaxonomyKingdom" /></td>
     <td><input type="text" name="specimenTaxonomyPhylum" /></td>
     <td><input type="text" name="specimenTaxonomyClass" /></td>
     <td><input type="text" name="specimenTaxonomyOrder" /></td>
     <td><input type="text" name="specimenTaxonomyFamily" /></td>
     <td><input type="text" name="specimenTaxonomyGenus" /></td>
     <td><input type="text" name="specimenTaxonomySpecies" /></td>
    </tr>
    <tr>
     <td>Collection area (format: Continent/Ocean; Country; State/Province; Region; Sector)</td>
     <td><input type="text" name="specimenCollectionAreaContinent" /></td>
     <td><input type="text" name="specimenCollectionAreaCountry" /></td>
     <td><input type="text" name="specimenCollectionAreaState" /></td>
     <td><input type="text" name="specimenCollectionAreaRegion" /></td>
     <td><input type="text" name="specimenCollectionAreaSector" /></td>
    </tr>
    <tr>
     <td>Collection elevation/depth</td>
     <td><input type="text" name="specimenElevation" /></td>
    </tr>
    <tr>
     <td>Collection GPS coordinates</td>
     <td><input type="text" name="specimenGPSX" /></td>
      <td><input type="text" name="specimenGPSY" /></td>
    </tr>
   
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>