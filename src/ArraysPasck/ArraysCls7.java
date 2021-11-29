package ArraysPasck;

import java.lang.reflect.Array;

public class ArraysCls7 {

    public static void main(String[] args) {

        int[] ededler = new int[5];
        Array.setInt(ededler,0,45);
        ededler[1] = 85;
        ededler[2] = 48;
        ededler[3] = 56;
        ededler[4] = 64;

        System.out.println(Array.getInt(ededler,2));


    }

}
