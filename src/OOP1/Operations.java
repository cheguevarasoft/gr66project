package OOP1;

public class Operations implements Arifmetik,Mentiqi {


    @Override
    public int vurma(int a, int b) {

        int result = a*b;
        return result;
    }

    @Override
    public boolean cutdurmu(int eded) {

        boolean result = false;

        if(eded%2==0){
            result = true;
        }
        return  result;
    }
}
