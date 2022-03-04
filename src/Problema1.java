import java.util.LinkedList;
import java.util.List;

public class Problema1 {

    public List<String> mostrarNumeros(){
        List<String> numeros = new LinkedList<>();

        for (int i = 0; i <= 20; i++) {
            if (multiplo_de_3_y_de_5(i)){
                numeros.add("FizzBuzz");
            }else if(multiplo_de_3(i)){
                numeros.add("Fizz");
            }else if (multiplo_de_5(i)){
                numeros.add("Buzz");
            }
            numeros.add(i);
        }
    }

    private boolean multiplo_de_3(int n){
        return n % 3 == 0;
    }

    private boolean multiplo_de_5(int n){
        return n % 5 == 0;
    }

    private boolean multiplo_de_3_y_de_5(int n){
        return n % 3 == 0 && n % 5 == 0;
    }

    private boolean multiplo_de_7(int n){
        return n % 7 == 0;
    }

    private boolean multiplo_de_11(int n){
        return n % 11 == 0;
    }
}
