package coches;

import java.util.Iterator;
import java.util.TreeSet;

public class CarreraCoches {
    TreeSet<Coche> coches;

    //Constructor
    CarreraCoches(TreeSet<Coche> coches){
        this.coches= coches;
    }
    
    //Metodo para añadir un coche
    void añadirCoche(Coche coche){
        coches.add(coche);
        System.out.println("Se ha añadido correctamente");
    }

    //Metodo para eliminar un coche
    void eliminarCoche(String nombre){
        Iterator<Coche> eliminador = coches.iterator();
        Coche coche;

        do{
            coche= eliminador.next();
            if(coche.getNombre().equals(nombre)){
                eliminador.remove();
            }
        }while(eliminador.hasNext());
    }


    //Metodo para retornar el ganador
    Coche getGuanyador(){
        Coche guanyador= null;
        //Encontrar el coche con mayor velocidad
        
        return guanyador;
    }
}
