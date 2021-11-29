package ExeptionPack;

import java.util.Scanner;

public class ExceptionCls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("a ni daxil edin");

        try{

            int a = sc.nextInt();

            System.out.println(a);

        }catch(Exception ex){
           System.out.println(ex);
           return;
        }
        finally {
            System.out.println("Farid Rzayev");
        }


        System.out.println("Tural Memmedov");

    }
}
