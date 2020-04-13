package Tehtävä_10_ChainOfResponsibility;

public class Ceo extends RaiseSalary {

    public void raiseRequest(WageSlave w) {
        double oldSalary = w.getSalary();
        System.out.printf("Hello %s, Your monthly salary proposal of %.2f€ is preposterous. That would increase your salary by %.2f%%. You're fired.\n", w.getName(), w.getNewSalary(), ((w.getNewSalary() - oldSalary) / oldSalary) * 100);
    }
}
