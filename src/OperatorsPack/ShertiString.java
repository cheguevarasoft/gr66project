package OperatorsPack;

import java.util.Scanner;

public class ShertiString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("adi daxil edin zehmet olmasa ");
        String name = sc.nextLine();
        String surname = "";

        if (name.equals("Tural")){
            surname = "Mammadov";
        }else if (name.equals("Rashad")){
            surname = "Qasimov";
        }else if(name.equals("Sahib")){
            surname = "Karimov";
        }else{
            surname = "Not Found";
        }

        System.out.println(surname);
    }
}
