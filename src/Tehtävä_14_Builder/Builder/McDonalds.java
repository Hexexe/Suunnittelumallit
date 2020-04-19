package Tehtävä_14_Builder.Builder;

import Tehtävä_14_Builder.Parts.*;

public class McDonalds implements BurgerBuilder {

    private StringBuilder s = new StringBuilder();

    @Override
    public void buildJuusto() { s.append("Juusto").append(", "); }

    @Override
    public void buildPihvi() { s.append("Pihvi").append(", "); }

    @Override
    public void buildBodypart() { s.append("Käsi").append(", "); }

    @Override
    public void buildSalaatti() { s.append("Salaatti").append(", "); }

    @Override
    public void buildSämpylä() { s.append("Sämpylä").append(", "); }

    @Override
    public void buildTomaatti() { s.append("Tomaatti").append(", "); }

    @Override
    public Object getBurger() { return s; }
}
