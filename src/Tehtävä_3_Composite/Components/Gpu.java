package Tehtävä_3_Composite.Components;

public class Gpu implements Component {

    private String nimi;
    private float hinta;

    public Gpu(String nimi, float hinta) {
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
