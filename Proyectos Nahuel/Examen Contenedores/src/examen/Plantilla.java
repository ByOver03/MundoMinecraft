package examen;

import java.util.Map;
import java.util.Scanner;
import java.examen.MetodosAuxiliares;

public class Plantilla {
    
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal){
        MetodosAuxiliares m = new MetodosAuxiliares();
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        String DNI = leer.next();
        String posicion = leer.next();
        int edad = leer.nextInt();
        
        Jugador j = new Jugador(nombre, edad, DNI, m.establecerPosicion(posicion));
        plantilla.put(dorsal, j);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal){

        return null;
    }

    static void mostrar(Map<Integer, Jugador>plantilla, String posicion){

    }

    static void mostrar(Map<Integer, Jugador> plantilla){

    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal){
        return false;
    }
}
