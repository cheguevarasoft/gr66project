package OperatorsPack;

import java.util.Scanner;

public class LoopTask4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = sc.nextInt();
        int fakt = 1;

       /* for(int i = 1;i<=eded;i++){

            fakt *=i;//fakt = fakt*i
        }*/

        for(int i = eded;i>=1;i--){

            fakt *=i;//fakt = fakt*i
        }

        System.out.println("ededin faktoriali "+fakt);

    }
}
