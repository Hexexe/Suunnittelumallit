package Tehtävä_21_Facade;

public class HardDrive {

    String hdData = "aHR0cHM6Ly93d3cueW91dHViZS5jb20vd2F0Y2g/dj1nTjRFMW5XMWVzQQ==";
    public byte[] read(long start, int size) {
        System.out.println("HD Start");
        String s = hdData.substring((int) start,size);
        System.out.println("HD done");
        return s.getBytes();
    }
}
