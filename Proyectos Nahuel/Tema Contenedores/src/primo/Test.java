package primo;

import java.util.Arrays;

public class Test {
    
    public static void main(String[] args) {
        Integer[]numeros= new Integer[100];

        
        numeros= Primo.cienNumeros();
        
        System.out.println(Arrays.deepToString(numeros));
        numeros= Primo.ordenarMayorMenor(numeros);
        
        
        
    }

}