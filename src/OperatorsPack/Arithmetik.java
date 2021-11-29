package OperatorsPack;

import java.util.Scanner;

public class Arithmetik {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("birinci deyeri daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = sc.nextInt();

        int c = a%b;

        System.out.println("cavabi  : " + c);


    }

}
