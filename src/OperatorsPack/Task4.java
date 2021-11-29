package OperatorsPack;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println(" bali daxil edin");
        int bal = src.nextInt();
        String result = "";

        if(bal>=0&&bal<=100){

            if (bal>=0&&bal<=50){
                result = "Kesildiniz";
            }else if(bal>50&&bal<=60){
                result = "Zeif";
            }else if(bal>60&&bal<=70){
                result = "Orta";
            }else if(bal>70&&bal<=80){
                result = "kafi";
            }else if(bal>80&&bal<=90){
                result = "yaxshi";
            }else if(bal>90&&bal<=100){
                result = "ela";
            }
        }else{
            result = "bele bal yoxdur";
        }

        System.out.println(result);
    }

}
