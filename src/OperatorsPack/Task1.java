package OperatorsPack;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = src.nextInt();
        String result = "";

        if(eded>0){
            result = "musbet";
        }else if(eded<0){
            result = "menfi";
        }else{

            result = "sifir";
        }

        System.out.println(result);

    }
}
