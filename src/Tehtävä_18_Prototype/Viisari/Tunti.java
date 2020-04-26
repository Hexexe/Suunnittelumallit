package Tehtävä_18_Prototype.Viisari;

public class Tunti implements Viisari,Cloneable {
    int arvo;

    public Tunti() { }
    public int getArvo() { return arvo; }
    public void setArvo(int arvo) { this.arvo = arvo; }
    public void tick() { arvo = (arvo >= 23) ? 0 : ++arvo; }
    public Object clone() throws CloneNotSupportedException { return super.clone(); }
}

