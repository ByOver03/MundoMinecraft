package fruta;

import java.util.ArrayList;
import java.util.Iterator;

public class BotigaDeFruites {
    ArrayList<Fruit> frutas;

    void afegirFruit(Fruit fruit){
        frutas.add(fruit);
        System.out.println("Se ha añadido correctamente");
    }

    void eliminarFruit(String nom){
        
        Iterator<Fruit> fruta= frutas.iterator();
        if(fruta.equals(nom)){
            
        }

        
        

    }
    double getPreuTotal(){
        
        return 0; 
    }

    
}
