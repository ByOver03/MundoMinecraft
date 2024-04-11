package recetas;


import java.util.HashSet;

public class Receta {
    String nombre;
    HashSet<Ingrediente> ingredientes;
    double precioTotal;
    int comensales;

    Receta(String nombre, int comensales, HashSet<Ingrediente> ingredientes){
        this.precioTotal= +20;
        this.nombre= nombre;
        this.comensales= comensales;
        this.ingredientes= ingredientes;
    }
}
