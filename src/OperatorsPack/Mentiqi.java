package OperatorsPack;

import java.util.Scanner;

public class Mentiqi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci deyeri daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = sc.nextInt();
        System.out.println("ucuncu deyeri daxil edin");
        int c = sc.nextInt();
        System.out.println("dorduncu deyeri daxil edin");
        int d = sc.nextInt();

        boolean netice = a>b||c<=d;
        System.out.println("cavabi : " + netice);
    }
}
