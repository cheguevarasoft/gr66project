package OperatorsPack;

import java.util.Scanner;

public class LoopsTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("esasi  daxil edin");
        int esas = sc.nextInt();
        System.out.println("quvveti  daxil edin");
        int quvvet = sc.nextInt();
        int result = 1;

        for(int i=1;i<=quvvet;i++){

            result*=esas;
        }

        System.out.println("quvvetin neticesi "+result);
    }

}
