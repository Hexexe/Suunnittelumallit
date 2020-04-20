package Tehtävä_15_Adapter;

public class BinaryAdapter_C implements BinaryAdapter {

    private Luku l;
    public BinaryAdapter_C(Luku l) { this.l = l; }
    @Override
    public String convert() { return Integer.toBinaryString(l.getI()); }
}
