package OOP2;

public class Mobile extends Product {

    @Override
    double adv(double amount) {
        double result = amount*0.12;
        return  result;
    }
}
