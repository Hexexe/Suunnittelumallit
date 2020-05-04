package Tehtävä_21_Facade;

import java.util.Arrays;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory Start");
        String s = new String(data);
        char[] c = s.toCharArray();
        System.out.println("data: " + Arrays.toString(c));
        System.out.printf("Memory position %d containing data %c \n", position, c[(int) position]);
        System.out.println("Memory done");
    }
}
