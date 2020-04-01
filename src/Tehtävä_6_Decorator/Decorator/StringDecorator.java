package Tehtävä_6_Decorator.Decorator;

import Tehtävä_6_Decorator.File.Data;

public abstract class StringDecorator implements Data {

    private Data data;

    public StringDecorator(Data data) {
        this.data = data;
    }

    @Override
    public void writeFile(String d) {
        data.writeFile(d);
    }

    @Override
    public String readFile() {
        return data.readFile();
    }
}
