package Tehtävä_14_Builder.Builder;

public interface BurgerBuilder {

    void buildJuusto();
    void buildPihvi();
    void buildBodypart();
    void buildSalaatti();
    void buildSämpylä();
    void buildTomaatti();
    Object getBurger();
}
