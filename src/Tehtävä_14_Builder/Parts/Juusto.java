package Tehtävä_14_Builder.Parts;

public class Juusto implements Osa {
    private String s;
    public Juusto(String s) { this.s = s; }
    @Override
    public String toString() { return s; }
}
