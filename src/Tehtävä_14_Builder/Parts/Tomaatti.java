package Tehtävä_14_Builder.Parts;

public class Tomaatti implements Osa {
    private String s;
    public Tomaatti(String s) { this.s = s; }
    @Override
    public String toString() { return s; }
}
