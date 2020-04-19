package Tehtävä_14_Builder.Parts;

public class Salaatti implements Osa {
    private String s;
    public Salaatti(String s) { this.s = s; }
    @Override
    public String toString() { return s; }
}
