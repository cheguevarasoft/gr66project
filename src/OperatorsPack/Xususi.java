package OperatorsPack;

import java.util.Scanner;

public class Xususi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci deyeri daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = sc.nextInt();

        //String netice = (a>b)?"duzdur":"sehvdir";
        int netice = (a<b)?100:101;

        System.out.println(netice);


    }
}
