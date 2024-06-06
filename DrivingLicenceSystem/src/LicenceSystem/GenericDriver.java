package LicenceSystem;

public class GenericDriver {
    private String name;
    private int points;
    private boolean isProvisional;
    protected String medicalReport;

    public GenericDriver(String name, boolean isProvisional) {
        this.name = name;
        this.points = 15;
        this.isProvisional = isProvisional;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public boolean getIsProvisional() {
        return isProvisional;
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport(String medicalReport) {
        this.medicalReport = medicalReport;
    }

    public void deductPoints(int p) {
        if (points >= p) {
            points -= p;
        } else {
            points = 0;
        }
        if (points == 0) {
            System.out.println("License Suspended");
        }
    }
}

