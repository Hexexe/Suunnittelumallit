package Tehtävä_14_Builder.Parts;

public class Ruumiinosa implements Osa {
    private String s;
    public Ruumiinosa(String s) { this.s = s; }
    @Override
    public String toString() { return s; }
}
