package Tehtävä_3_Composite.Components;

public class Ram implements Component {

    private String nimi;
    private float hinta;

    public Ram(String nimi, float hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public float getHinta() {
        return hinta;
    }

    @Override
    public String toString(){
        return nimi + " " + hinta + "€";
    }
}
