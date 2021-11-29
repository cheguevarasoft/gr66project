package OOP2;

public class ProductMain {

    public static void main(String[] args) {

        Mobile mob = new Mobile();
        double netice1 = mob.adv(600);
        System.out.println(netice1);

        Notebook not = new Notebook();
        double netice2 = not.adv(600);
        System.out.println(netice2);
    }
}
