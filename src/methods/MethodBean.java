package methods;

public class MethodBean {

	private String methodDescription;
	public enum Types{
		Amplification,
		Extraction,
		Sequencing,
		Taxonomic,
		Collection
	}
	private Types methodType;
	
	public String getMethodType() {
		return methodType.toString();
	}
	
	public void setMethodType(Types methodType) {
		this.methodType = methodType;
	}
	
	public String getMethodDescription() {
		return methodDescription;
	}
	
	public void setMethodDescription(String methodDescription) {
		this.methodDescription = methodDescription;
	}
	


}