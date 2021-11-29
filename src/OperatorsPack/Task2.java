package OperatorsPack;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = src.nextInt();
        String result = "";

        if(eded%2==0){
            result = "cut";
        }else{
            result = "tek";
        }

        System.out.println(result);
    }
}
