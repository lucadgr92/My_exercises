public class Auto {
    private int cylinderCap;
    private String licensePlate;
    private String brand;
    private String model;

    public Auto(int cylinderCap, String licensePlate, String brand, String model) {
        this.cylinderCap = cylinderCap;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
    }

    public int getCylinderCap() {
        return cylinderCap;
    }

    public void setCylinderCap(int cylinderCap) {
        this.cylinderCap = cylinderCap;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
