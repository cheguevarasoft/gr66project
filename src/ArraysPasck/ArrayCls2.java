package ArraysPasck;

import java.util.Arrays;

public class ArrayCls2 {

    public static void main(String[] args) {

        String[] names = new String[6];
        names[0] = "Bunyad";
        names[1] = "Tural";
        names[2] = "Sahib";
        names[3] = "Mamed";
        names[4] = "Rashad";
        names[5] = "Suliddin";

      /*  for(int i = 0;i<=names.length-1;i++){

            System.out.println(names[i]);
        }*/

        Arrays.sort(names);
      for(String name:names){

          System.out.println(name);
      }

    }

}
