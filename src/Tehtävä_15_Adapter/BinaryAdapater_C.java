package Tehtävä_15_Adapter;

public class BinaryAdapater_C implements BinaryAdapter {

    private Luku l;
    public BinaryAdapater_C(Luku l) { this.l = l; }
    @Override
    public String convert() { return Integer.toBinaryString(l.getI()); }
}
