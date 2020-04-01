package Tehtävä_3_Composite.Components;

public class Cpu implements Component {

    private String nimi;
    private float hinta;

    public Cpu(String nimi, float hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public float getHinta() {
        return hinta;
    }

    @Override
    public String toString() {
        return nimi + " " + hinta + "€";
    }
}
