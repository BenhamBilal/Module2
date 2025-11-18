public class Auto {

    private double killometerTeller;
    private double brandStofTankInLiter;
    private double brandStofVerbruikInLiter = 6;
    private final double maxBrandstof = 50;

    public Auto(double killometerTeller,double brandStofTankInLiter,double brandStofVerbruikInLiter){
        this.killometerTeller = killometerTeller;
        this.brandStofTankInLiter = brandStofTankInLiter;
        this.brandStofVerbruikInLiter = brandStofVerbruikInLiter;
    }

    public Auto(double brandStofVerbruikInLiter){
        this.killometerTeller = 0;
        this.brandStofTankInLiter = 0;
        this.brandStofVerbruikInLiter = brandStofVerbruikInLiter;
    }

    public double getKillometerTeller() {
        return killometerTeller;
    }

    public void setKillometerTeller(double killometerTeller) {
        this.killometerTeller = killometerTeller;
    }

    public double getBrandStofTankInLiter() {
        return brandStofTankInLiter;
    }

    public void setBrandStofTankInLiter(double brandStofTankInLiter) {
        this.brandStofTankInLiter = brandStofTankInLiter;
    }

    public double getBrandStofVerbruikInLiter() {
        return brandStofVerbruikInLiter;
    }

    public void setBrandStofVerbruikInLiter(double brandStofVerbruikInLiter) {
        this.brandStofVerbruikInLiter = brandStofVerbruikInLiter;
    }

    public double getMaxBrandstof() {
        return maxBrandstof;
    }

    public void tankBijVullen(){
        this.brandStofTankInLiter = this.maxBrandstof;
    }

    public double aantalkillometersTeRijden(){
        return brandStofTankInLiter / brandStofVerbruikInLiter * 100;
    }
}
