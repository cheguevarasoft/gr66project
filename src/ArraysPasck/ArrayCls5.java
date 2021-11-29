package ArraysPasck;

import java.util.Arrays;

public class ArrayCls5 {

    public static void main(String[] args) {

        int[] ededler = new int[5];
        ededler[0] = 45;
        ededler[1] = 85;
        ededler[2] = 48;
        ededler[3] = 56;
        ededler[4] = 64;

        Arrays.parallelSort(ededler);

        for(int eded:ededler){
            System.out.println(eded);
        }


    }
}
