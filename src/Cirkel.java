public class Cirkel {

    private float straal = 0;
    private String kleur = "wit";
    private final float Pi = (float) Math.PI;

    public Cirkel() {

    }

    public void setStraal(float straal) {
        this.straal = straal;
    }

    public float getStraal() {
        return straal;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    public void print() {
        System.out.println("straal = " + straal + "\n" +
                "Kleur = " + kleur);
    }

    public float geefOmtrek() {
        return 2 * Pi * straal;
    }

    public float geefOppervlakte() {
        return Pi * straal * straal;
    }
}
