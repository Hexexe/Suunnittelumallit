package Tehtävä_3_Composite.Factories;

import Tehtävä_3_Composite.Components.Component;

public interface PrebuildPCFactory {
    Component createCase();
    Component createMotherboard();
    Component createCpu();
    Component createGpu();
    Component createRam();
    Component createSsd();
    Component createPower();
    Component createCooling();
}
