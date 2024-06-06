package LicenceSystem;

public class CommercialDriver extends GenericDriver{
	private String hazardousMaterialsType;
	private String carType;
	private String setMedicalReport;
	public CommercialDriver(String name, boolean isprovisional,String materialType,String car ) 
	{
		super(name, isprovisional);
		hazardousMaterialsType=materialType;
		carType=car;
	}
	public String getMaterialsType(){
	return hazardousMaterialsType;
	}
	public void setMedicalReport() {
		setMedicalReport="Approved to drive"+carType;
		
	}
}
