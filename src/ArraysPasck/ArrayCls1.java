package ArraysPasck;

public class ArrayCls1 {

    public static void main(String[] args) {
        String[] names = new String[6];
        names[0] = "Bunyad";
        names[1] = "Tural";
        names[2] = "Sahib";
        names[3] = "Mamed";
        names[4] = "Rashad";
        names[5] = "Suliddin";

        int uzunluq = names.length;
        System.out.println(uzunluq);

        System.out.println(names[2]);

        System.out.println(names[names.length-1]);




    }


}
