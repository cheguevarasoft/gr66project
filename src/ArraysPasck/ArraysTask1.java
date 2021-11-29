package ArraysPasck;

public class ArraysTask1 {

    public static void main(String[] args) {

        int[] ededler = new int[5];
        ededler[0] = 45;
        ededler[1] = 85;
        ededler[2] = 48;
        ededler[3] = 56;
        ededler[4] = 64;

        int cutcem = 0;
        int tekcem = 0;
        int cutsay = 0;
        int teksay = 0;

        for(int eded:ededler){

            if (eded%2==0){
                cutcem+=eded;
                cutsay++;

            }else{

                tekcem+=eded;
                teksay++;
            }

        }

        System.out.println(cutcem);
        System.out.println(cutsay);
        System.out.println(tekcem);
        System.out.println(teksay);
    }
}
