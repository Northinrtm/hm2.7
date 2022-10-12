public class Mechanic<T extends Transport>{
    private final String name;
    private final String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }
    public void maintenance(T transport){
        transport.maintenance();
    }
    public void repair(T transport){
        transport.repair();
    }
}
