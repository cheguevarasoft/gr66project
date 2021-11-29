package OperatorsPack;

public class LoopsCls4 {

    public static void main(String[] args) {

        String netice = "";
        int saygac = 0;
        for(int i=1;i<=4;i++){

            for(int j=1;j<=i;j++){

                netice+=saygac;
                saygac++;
            }

            netice +="\n";
        }

        System.out.println(netice);
    }

}
