public class Cirkel {

    private float straal;
    private int x;
    private int y;

    public Cirkel (){
        this.x = 0;
        this.y = 0;
        this.straal = 1;
    }

    public void setStraal(float straal){
        this.straal = straal;
    }

    public void setMidden(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double oppervlakte(){
        return Math.PI * this.straal * this.straal;
    }
    public double omtrek(){
        return 2 * Math.PI * this.straal;
    }

}
