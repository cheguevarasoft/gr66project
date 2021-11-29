package OperatorsPack;

import java.util.Scanner;

public class TaskTekCutCem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = sc.nextInt();

        int cutcem = 0;
        int tekcem = 0;

        for (int i=a;i<=b;i++){

            if(i%2==0){
                cutcem+=i;
            }else{
                tekcem+=i;
            }
        }

        System.out.println("cut ededlerin cemi "+cutcem);
        System.out.println("tek ededlerin "+tekcem);

    }

}
