package gestionFicheros;

import java.io.*;

public class EscrbirFicherosBinarios {
    
    public static void escribeFicheroStringToObject(String cadena, String fichero) {    
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(cadena);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }
}
