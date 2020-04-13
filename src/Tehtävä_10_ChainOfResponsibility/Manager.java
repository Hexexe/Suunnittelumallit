package Tehtävä_10_ChainOfResponsibility;

public class Manager extends RaiseSalary {

    public void raiseRequest(WageSlave w) {
        double oldSalary = w.getSalary();
        if (w.getNewSalary() <= w.getSalary() * 1.02) {
            w.setSalary(w.getNewSalary());
            System.out.printf("Hello %s, Your monthly salary has been increased by %.2f%% and is now %.2f€\n", w.getName(), ((w.getNewSalary() - oldSalary) / oldSalary) * 100,w.getSalary());
        } else {
            System.out.printf("Hello %s, Unfortunately your monthly salary proposal of %.2f€ exceeds the 2%% limit. please direct your proposal to the Director\n", w.getName(), w.getNewSalary());
            super.raiseRequest(w);
        }
    }
}
