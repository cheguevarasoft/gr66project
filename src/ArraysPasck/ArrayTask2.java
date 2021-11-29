package ArraysPasck;

public class ArrayTask2 {

    public static void main(String[] args) {

        int[] ededler = new int[5];
        ededler[0] = 45;
        ededler[1] = 15;
        ededler[2] = 48;
        ededler[3] = 280;
        ededler[4] = 64;

        int min = ededler[0];
        int max = ededler[0];

        for(int i = 0;i<=ededler.length-1;i++){

            if(ededler[i]<min){
                min = ededler[i];
            }

            if(ededler[i]>max){
                max = ededler[i];
            }

        }

        System.out.println(min);
        System.out.println(max);
    }


}
