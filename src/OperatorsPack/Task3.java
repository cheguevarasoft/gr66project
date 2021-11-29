package OperatorsPack;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("ededi daxil edin");
        int eded = src.nextInt();
        String result = "";

        if(eded%4==0&&eded%6==0){
            result = "bolunur";
        }else{
            result = "bolunmur";
        }

        System.out.println(result);
    }

}
