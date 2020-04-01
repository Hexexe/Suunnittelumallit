package Tehtävä_3_Composite;

import Tehtävä_3_Composite.Components.Case;
import Tehtävä_3_Composite.Components.Component;
import Tehtävä_3_Composite.Components.Motherboard;
import Tehtävä_3_Composite.Factories.BattlestationPC;
import Tehtävä_3_Composite.Factories.DogshitPC;
import Tehtävä_3_Composite.Factories.PrebuildPCFactory;

public class Main {

    public static Component buildPC(PrebuildPCFactory p) {
        Component pc = p.createCase();
        Component storage = p.createSsd();
        Component power = p.createPower();
        Component cool = p.createCooling();
        Component mb = p.createMotherboard();
        Component cpu = p.createCpu();
        Component gpu = p.createGpu();
        Component ram = p.createRam();
        ((Case) pc).addComponent(power);
        ((Case) pc).addComponent(cool);
        ((Case) pc).addComponent(storage);
        ((Case) pc).addComponent(mb);
        ((Motherboard) mb).addComponent(gpu);
        ((Motherboard) mb).addComponent(cpu);
        ((Motherboard) mb).addComponent(ram);
        return pc;
    }

    public static void main(String[] args) {

        PrebuildPCFactory p = new DogshitPC();
        PrebuildPCFactory b = new BattlestationPC();

        Component c = buildPC(p);
        System.out.print("\nDogshit PC:\n" + c + "Koneen kokonaishinta: " + c.getHinta() + "€\n");
        c = buildPC(b);
        System.out.print("\nBattlestation PC:\n" + c + "Koneen kokonaishinta: " + c.getHinta() + "€\n");

    }
}
