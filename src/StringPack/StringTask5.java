package StringPack;

import java.util.Scanner;

public class StringTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String soz = sc.nextLine();

        boolean netice = false;

        if(soz.startsWith("a")){

            netice = true;
        }

        System.out.println(netice);



    }
}
