package Tehtävä_14_Builder.Parts;

public class Sämpylä implements Osa {
    private String s;
    public Sämpylä(String s) { this.s = s; }
    @Override
    public String toString() { return s; }
}
