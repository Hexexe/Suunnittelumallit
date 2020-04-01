package Tehtävä_6_Decorator;

import java.io.*;

public class FileData implements Data {

    private String t;

    public FileData(String t) {
        this.t = t;
    }

    @Override
    public void writeFile(String d) {
        try (OutputStream o = new FileOutputStream(new File(t))) {
            o.write(d.getBytes(), 0, d.length());
        } catch (IOException e) {
            e.getMessage();
        }
    }

    @Override
    public String readFile() {
        char[] buffer = null;
        File file = new File(t);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new String(buffer);
    }
}
