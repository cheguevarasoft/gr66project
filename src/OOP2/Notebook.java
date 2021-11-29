package OOP2;

public class Notebook extends Product {

    @Override
    double adv(double amount) {
        double result = amount*0.14;
        return  result;
    }
}
