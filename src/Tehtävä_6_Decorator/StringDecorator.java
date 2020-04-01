package Tehtävä_6_Decorator;

public class StringDecorator implements Data {

    private Data source;

    public StringDecorator(Data source) {
        this.source = source;
    }

    @Override
    public void writeFile(String d) {
        source.writeFile(d);
    }

    @Override
    public String readFile() {
        return source.readFile();
    }
}
