package primo;

import java.util.ArrayList;
import java.util.List;

public class Primo {
    static boolean esPrimer(Integer n){
        
        
        return false;
    }
    
    static List<Integer> cienNumeros(){
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            numeros.add((int)(Math.random()*1000)+1);
        }
        return numeros;
    }

    
}
