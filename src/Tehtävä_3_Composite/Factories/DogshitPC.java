package Tehtävä_3_Composite.Factories;

import Tehtävä_3_Composite.Components.*;

public class DogshitPC implements PrebuildPCFactory {
    @Override
    public Component createCase() {
        return new Case("Dogshit Case",35);
    }

    @Override
    public Component createMotherboard() { return new Motherboard("Dogshit Motherboard",63); }

    @Override
    public Component createCpu() {
        return new Cpu("Dogshit CPU(intel)",47);
    }

    @Override
    public Component createGpu() {
        return new Gpu("Dogshit GPU (integroitu)",0);
    }

    @Override
    public Component createRam() {
        return new Ram("Dogshit rgb meme RAM",42);
    }

    @Override
    public Component createSsd() { return new Storage("Dogshit SSD",34); }

    @Override
    public Component createPower() { return new Power("Dogshit PowerSupply", 35); }

    @Override
    public Component createCooling() { return new Cooling("Dogshit Cooling", 26); }
}
