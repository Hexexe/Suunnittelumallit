package Tehtävä_18_Prototype.Viisari;

public class Sekunti implements Viisari,Cloneable {
    int arvo;

    public Sekunti() { }
    public int getArvo() { return arvo; }
    public void setArvo(int arvo) { this.arvo = arvo; }
    public void tick() { arvo = (arvo >= 59) ? 0 : ++arvo; }
    public Object clone() throws CloneNotSupportedException { return super.clone(); }
}

