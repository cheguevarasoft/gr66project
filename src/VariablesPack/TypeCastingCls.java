package VariablesPack;

import org.w3c.dom.ls.LSOutput;

public class TypeCastingCls {

    public static void main(String[] args) {

      /*  String k = "45";
        int a = Integer.valueOf(k) ;
        System.out.println(a);

        String b = String.valueOf(45);
        System.out.println(b);

        double d = Double.valueOf("85");*/

      byte b = 45;
      int a = b;
      System.out.println(a);

      int a1 = 64;
      double d1 = a1;
        System.out.println(d1);

        char c = 'P';
        int a2 = c;
        System.out.println(a2);

        int a3 = 570;
        byte b3 = (byte)a3;
        System.out.println(b3);


        double d4 = 45.67;
        int a4 = (int)d4;
        System.out.println(a4);

        int a5 = 78;
        char c5 = (char)a5;
        System.out.println(c5);



    }







}
