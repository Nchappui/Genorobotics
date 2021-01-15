package specimen;

public class SpecimenBean {

	private String extraInfos = "";
	private String measurementType;
	private String image;
	private String imageTimestamp;
	private String imageDescription= "";
	private String imageCopyright;
	private String host;
	public enum Sexes{
		male,
		female,
		Hermaphrodite
	}
	private Sexes sex = null;
	public enum LifeStages{
		Adult,
		Immature
	}
	private LifeStages lifeStage;
	public enum ReproductionTypes{
		Sexual,
		Asexual,
		Cyclic,
		Pathogen
	}
	private ReproductionTypes reproduction;
	private String collectionMethodName;
	private String taxonomicMethodName;
	private String taxonomicTimestamp;
	private String collectionTimestamp;
	//Full taxonomy in the format: Domain; Kingdom; Phylum; Class; Order; Family; Genus; Species.
	private String[] taxonomy = new String[8];
	//Description of the part of the world where the specimen was collected in the format: Continent/Ocean; Country; State/Province; Region; Sector.
	private String[] collectionArea = new String[6];
	private String collectionElevation;
	private String collectionGPSX;
	private String collectionGPSY;
	
	public String getExtraInfos() {
		return extraInfos;
	}
	
	public void setExtraInfos(String extraInfos) {
		this.extraInfos = extraInfos;
	}
	
	public String getMeasurementType() {
		return measurementType;
	}
	
	public void setMeasurementType(String measurementType) {
		this.measurementType = measurementType;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getImageTimestamp() {
		return imageTimestamp;
	}
	
	public void setImageTimestamp(String imageTimestamp) {
		this.imageTimestamp = imageTimestamp;
	}
	public String getImageDescription() {
		return imageDescription;
	}
	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}
	public String getImageCopyright() {
		return imageCopyright;
	}
	
	public void setImageCopyright(String imageCopyright) {
		this.imageCopyright = imageCopyright;
	}
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public String getSex() {
		return sex.toString();
	}
	
	public void setSex(Sexes sex) {
		this.sex = sex;
	}
	
	public String getLifeStage() {
		return lifeStage.toString();
	}
	public void setLifeStage(LifeStages lifeStage) {
		this.lifeStage = lifeStage;
	}
	public String getReproduction() {
		return reproduction.toString();
	}
	
	public void setReproduction(ReproductionTypes reproduction) {
		this.reproduction = reproduction;
	}
	
	public String getTaxonomicTimestamp() {
		return taxonomicTimestamp;
	}
	
	public void setTaxonomicTimestamp(String taxonomicTimestamp) {
		this.taxonomicTimestamp = taxonomicTimestamp;
	}
	
	public String getCollectionTimestamp() {
		return collectionTimestamp;
	}
	public void setCollectionTimestamp(String collectionTimestamp) {
		this.collectionTimestamp = collectionTimestamp;
	}
	
	public String[] getTaxonomy() {
		return taxonomy;
	}
	
	public void setTaxonomy(String[] taxonomy) {
		this.taxonomy = taxonomy;
	}
	
	public String[] getCollectionArea() {
		return collectionArea;
	}
	
	public void setCollectionArea(String[] collectionArea) {
		this.collectionArea = collectionArea;
	}
	
	public String getCollectionElevation() {
		return collectionElevation;
	}
	
	public void setCollectionElevation(String collectionElevation) {
		this.collectionElevation = collectionElevation;
	}
	
	public String getCollectionGPSX() {
		return collectionGPSX;
	}
	
	public void setCollectionGPSX(String collectionGPSX) {
		this.collectionGPSX = collectionGPSX;
	}
	
	public String getCollectionGPSY() {
		return collectionGPSY;
	}
	
	public void setCollectionGPSY(String collectionGPSY) {
		this.collectionGPSY = collectionGPSY;
	}

	public String getCollectionMethodName() {
		return collectionMethodName;
	}

	public void setCollectionMethodName(String collectionMethodName) {
		this.collectionMethodName = collectionMethodName;
	}

	public String getTaxonomicMethodName() {
		return taxonomicMethodName;
	}

	public void setTaxonomicMethodName(String taxonomicMethodName) {
		this.taxonomicMethodName = taxonomicMethodName;
	}
	
}
