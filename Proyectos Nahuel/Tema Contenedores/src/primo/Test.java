package primo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    
    public static void main(String[] args) {
        
        List<Integer> numeros= new ArrayList<>();
        numeros= Primo.cienNumeros();
        System.out.println(numeros.toString());
        Stream<Integer>s = numeros.stream();
        
        
        
    }

}