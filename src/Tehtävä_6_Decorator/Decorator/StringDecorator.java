package Tehtävä_6_Decorator.Decorator;

import Tehtävä_6_Decorator.File.FileManager;

public abstract class StringDecorator implements FileManager {

    private FileManager fileManager;

    public StringDecorator(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void writeFile(String d) { fileManager.writeFile(d); }

    @Override
    public String readFile() {
        return fileManager.readFile();
    }
}
