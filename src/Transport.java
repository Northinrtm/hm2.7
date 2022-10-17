import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private List<Driver<?>> driverList = new ArrayList<>();
    private List<Mechanic<?>> mechanicList = new ArrayList<>();
    private List<Sponsor> sponsorList = new ArrayList<>();
    final private String brand;
    final private String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    protected abstract void refill();

    public Transport(String brand, String model) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "не указана марка";
        }
        if (brand != null) {
            this.model = model;
        } else {
            this.model = "не указана марка";
        }
    }

    public List<Driver<?>> getDriverList() {
        return driverList;
    }

    public List<Mechanic<?>> getMechanicList() {
        return mechanicList;
    }

    public List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public void addDriver(Driver<?> driver) {
        driverList.add(driver);
    }
    public void addMechanic(Mechanic<?> mechanic) {
        mechanicList.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor) {
        sponsorList.add(sponsor);
    }

    abstract void identifyAuto();

    public abstract void maintenance();

    public abstract void repair();
}
