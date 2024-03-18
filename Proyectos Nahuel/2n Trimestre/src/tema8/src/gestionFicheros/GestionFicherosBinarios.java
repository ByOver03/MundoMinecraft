package tema8.src.gestionFicheros;

import java.io.*;

public class GestionFicherosBinarios {
    // Este metodo escribe un String en un fichero binario
    public static void escribeFicheroStringToObject(String cadena, String fichero) {    
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(cadena);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero y lo devuelve como un String
    public static String leerFicheroObjectToString(String fichero) {
        String cadena = "";
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            cadena = (String)ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return cadena;
    }

    // Este metodo escribe un array de enteros en un fichero binario
    public static void escribirFicheroArraysIntToObject(int[] array, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(array);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero y lo devuelve como un array de enteros
    public static int[] leerFicheroObjetToArrayInt(String fichero) {
        int[] array = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            array = (int[])ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return array;
    }

    // Este metodo escribe un array de Integers en un fichero binario
    public static void escribirFicheroArrayIntegerToObject(Integer[] array, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(array);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero binario y lo devuelve como un array de Integers
    public static Integer[] leerFicheroObjectToArrayInteger(String fichero) {
        Integer[] array = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            array = (Integer[])ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return array;
    }

    // Este metodo escribe array de doubles en un fichero binario
    public static void escribirFicheroArrayDoubleToObject(double[] array, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(array);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero y lo devuelve como un array de doubles
    public static double[] leerFicheroObjectToArrayDouble(String fichero) {
        double[] array = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            array = (double[])ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: ");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return array;
    }

    // Este metodo escribe un objeto de una clase en un fichero binario
    public static void escribirFicheroClassToObject(Object o, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(o);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero y lo devuelve como un objeto de una clase
    public static Object leerFicheroObjectToClass(String fichero) {
        Object o = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            o = (Object)ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return o;
    }

    // Este metodo escrible un array de una clase
    public static void escribirFicheroArrayClassToObject(Object[] array, String fichero) {
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(fichero))) {
            ous.writeObject(array);

        } catch (IOException e) {
            System.out.println("Error de escritura de fichero: " + e.getMessage());
        }
    }

    // Este metodo lee un fichero y lo devuelve como un array de una clase
    public static Object[] leerFicheroObjectToArrayClass(String fichero) {
        Object[] array = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            array = (Object[])ois.readObject();

        } catch (IOException e) {
            System.out.println("Error de lectura de fichero: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de conversión de datos: " + e.getMessage());
        }
        return array;
    }

}
