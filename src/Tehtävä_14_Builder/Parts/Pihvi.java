package Tehtävä_14_Builder.Parts;

public class Pihvi implements Osa {
    private String s;
    public Pihvi(String s) { this.s = s; }
    @Override
    public String toString() { return s; }
}
