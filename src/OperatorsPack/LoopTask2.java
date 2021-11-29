package OperatorsPack;

import java.util.Scanner;

public class LoopTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin");
        int a = sc.nextInt();
        System.out.println("ikinci deyeri daxil edin");
        int b = sc.nextInt();

        int bolunencem34 = 0;
        int bolunensay34 = 0;
        int bolunencem46 = 0;
        int bolunensay46 = 0;

        for (int i=a;i<=b;i++){

            if(i%3==0||i%4==0){
                bolunencem34+=i;
                bolunensay34++;
            }


            if(i%4==0&&i%6==0){
                bolunencem46+=i;
                bolunensay46++;
            }
        }

        System.out.println("34 cem "+bolunencem34);
        System.out.println("34 say "+bolunensay34);
        System.out.println("46 cem "+bolunencem46);
        System.out.println("46 say "+bolunensay46);
    }


}
