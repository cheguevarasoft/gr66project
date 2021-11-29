package OOP1;

public class StudentMain {

    public static void main(String[] args) {

        Student telebe = new Student();

        telebe.setId(1005);
        telebe.setName("Farid");
        telebe.setSurname("rzaYEV");
        telebe.setAvg(45.7);
        telebe.setActive(true);

        System.out.println(telebe.getName());

        telebe.printData();
    }
}
