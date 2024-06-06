package LicenceSystem;

public class DriverProgram {
    public static void main(String[] args) {
        GenericDriver Tom = new GenericDriver("Tom", true);
        Tom.deductPoints(3);
        Tom.setMedicalReport("Approved to drive private car");

        CommercialDriver Lily = new CommercialDriver("Lily", true, "flammable", "truck");
        Lily.deductPoints(5);
        Lily.setMedicalReport();

        GenericDriver[] driverArray = new GenericDriver[2];
        driverArray[0] = Tom;
        driverArray[1] = Lily;

        for (GenericDriver driver : driverArray) {
            System.out.println(driver.getName() + "'s licence is provisional: " + driver.getIsProvisional());
            System.out.println(driver.getName() + " has " + driver.getPoints() + " points");
            System.out.println(driver.getMedicalReport());
        }
    }
}
