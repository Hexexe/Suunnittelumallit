package Tehtävä_10_ChainOfResponsibility;

public class Director extends RaiseSalary {

    public void raiseRequest(WageSlave w) {
        double oldSalary = w.getSalary();
        if (w.getNewSalary() <= w.getSalary() * 1.05) {
            w.setSalary(w.getNewSalary());
            System.out.printf("Hello %s, Your monthly salary has been increased by %.2f%% and is now %.2f€\n", w.getName(), ((w.getNewSalary() - oldSalary) / oldSalary) * 100,w.getSalary());
        } else {
            System.out.printf("Hello %s, Unfortunately your monthly salary proposal of %.2f€ exceeds the 5%% limit. please direct your proposal to the CEO\n", w.getName(), w.getNewSalary());
            super.raiseRequest(w);
        }
    }
}
