public class Adres {

    private String straatNaam;
    private int huisNummer;
    private int bus;
    private int postCode;
    private String woonPlaats;

    public Adres(String straatNaam, int huisNummer, int bus, int postCode, String woonPlaats) {
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.bus = bus;
        this.setPostCode(postCode);
        this.woonPlaats = woonPlaats;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public int getHuisNummer() {
        return huisNummer;
    }

    public void setHuisNummer(int huisNummer) {
        this.huisNummer = huisNummer;
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        if (postCode >= 1000 && postCode < 9999) {
            this.postCode = postCode;
        }else{
            this.postCode = 9999;
            System.out.println("Postcode niet geldig");
        };
    }

    public String getWoonPlaats() {
        return woonPlaats;
    }

    public void setWoonPlaats(String woonPlaats) {
        this.woonPlaats = woonPlaats;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "straatNaam='" + straatNaam + '\'' +
                ", huisNummer=" + huisNummer +
                ", bus=" + bus +
                ", postCode=" + postCode +
                ", woonPlaats='" + woonPlaats + '\'' +
                '}';
    }
}
