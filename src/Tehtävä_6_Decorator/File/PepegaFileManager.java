package Tehtävä_6_Decorator.File;

import java.io.*;

public class PepegaFileManager implements FileManager {

    private String filename;

    public PepegaFileManager(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeFile(String d) {
        try (OutputStream o = new FileOutputStream(new File(filename))) {
            o.write(d.getBytes());
        } catch (IOException e) {
            e.getMessage();
        }
    }

    @Override
    public String readFile() {
        char[] buffer = null;
        File file = new File(filename);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new String(buffer);
    }
}
