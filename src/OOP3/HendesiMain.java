package OOP3;

import AccMod2.D;

public class HendesiMain {

    public static void main(String[] args) {

        Kvadrat kvad = new Kvadrat();
        int sahe = kvad.saheHesabla(4);
        System.out.println(sahe);

        Duzbucaqli duz = new Duzbucaqli();
        duz.b = 4;
        int sahe1 = duz.saheHesabla(5);
        System.out.println(sahe1);


    }

}
