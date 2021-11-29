package OOP1;

public class CarMain {

    public static void main(String[] args) {

        Car tt = new Toyota();
        tt.marca = "Toyota";
        tt.start();
        tt.stop();

        Car aa = new Audi();
        aa.marca = "Audi";
        aa.start();
        aa.stop();

       // carTesting(tt);
        carTesting(aa);
    }

    static void carTesting(Car data){
        System.out.println("test edildi : "+data.marca);
    }



}
