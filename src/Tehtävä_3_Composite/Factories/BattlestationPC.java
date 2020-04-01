package Tehtävä_3_Composite.Factories;

import Tehtävä_3_Composite.Components.*;

public class BattlestationPC implements PrebuildPCFactory {
    @Override
    public Component createCase() {
        return new Case("Battlestation Case", 1000);
    }

    @Override
    public Component createMotherboard() {
        return new Motherboard("Battlestation Motherboard", 1200);
    }

    @Override
    public Component createCpu() { return new Cpu("Battlestation CPU", 3500); }

    @Override
    public Component createGpu() {
        return new Gpu("Battlestation GPU(2x)", 2800);
    }

    @Override
    public Component createRam() {
        return new Ram("Battlestation rgb meme RAM", 1200);
    }

    @Override
    public Component createSsd() { return new Storage("Battlestation SSD (2x)", 480); }

    @Override
    public Component createPower() { return new Power("Battlestation PowerSupply(2x)", 600); }

    @Override
    public Component createCooling() { return new Cooling("Battlestation Cooling", 300); }
}
