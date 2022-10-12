public class Sponsor {
    private final String name;
    private final int supportAmount;

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public Sponsor(String name, int supportAmount) {
        this.name = name;
        this.supportAmount = supportAmount;
    }
    public void sponsoredRace(){
        System.out.println("Sponsor.sponsoredRace()");
    }
}
