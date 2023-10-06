public class Car {
    private int horses;
    private String licensePlate;
    private String brand;
    private String model;

    public Car(int horses, String licensePlate, String brand, String model) {
        this.horses = horses;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
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
