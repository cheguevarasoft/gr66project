package OperatorsPack;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ay = sc.next();

        switch (ay){
            case "Dekabr":

            case "Yanvar":

            case "Fevral":
                System.out.println("Qish");
                break;
            default:
                System.out.println("bele ay yoxdur");
                break;
        }
    }

}
