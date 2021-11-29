package OperatorsPack;

import java.util.Scanner;

public class Sherti2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gun daxil edin");
        int gun = sc.nextInt();

        switch (gun){
            case 1:
                System.out.println("Bazar Ertesi");
                break;
            case 2:
            case 3:
                System.out.println("Chersenbe");
                break;
            case 4:
                System.out.println("Cume axshami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Shenbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("bele gun yoxdur");
                break;
        }

    }

}
