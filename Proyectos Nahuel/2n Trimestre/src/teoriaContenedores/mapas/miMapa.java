package teoriaContenedores.mapas;

import java.util.HashMap;
import java.util.Map;

public class miMapa {
    public static void main(String[] args) {
        Map<Integer,String> miMapa = new HashMap<>();

         miMapa.put(20, "Pedro");
         miMapa.put(33, "Ana");
         miMapa.put(12, "Juan");
        
        for (Integer integer : miMapa.keySet()) {
            System.out.println("Clave: " +integer + "Valor " + miMapa.get(integer));
        }
    }
}
