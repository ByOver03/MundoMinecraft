package generador;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

import scanner.Scan;
public class GeneradorDeMenus {

    //Metodo que Imprime un menu de forma visual
    public static void generaMenus(String[] menu){
        menu[0]= "Indique La opcion que usted quiera";

        int i= 1;
        System.out.println("*********************************************************");
        for (String string : menu) {
            if(string.equals(menu[0])){
                System.out.println(string);
            }else{
                    
                    System.out.println("[" +i +"] " + string);
                    i++;
            }  
        }
        System.out.println("*********************************************************");
    }
    public static <T>void chichaMenu(String[] menu,T parametro){
        int usuario=0;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Introduzca un parametro para confirmar la operacion");
            generaMenus(menu);
            usuario= leer.nextInt();
            if(MetodoDevuelve.getRegistro().containsKey(usuario)){
                MetodoDevuelve.ejecutar(usuario, parametro);
            }else if(MetodoVoid.getMetodos().containsKey(usuario)){
                MetodoVoid.ejecutarMetodo(usuario, parametro);
            }
        } while (menu.length-1!=usuario);
        leer.close();
    }

    public static String devuelveString(String parametro){
        System.out.println("Escriba un parametro");
        Scanner leer = new Scanner(System.in);
        String string= leer.nextLine();
        leer.close();
        
        return string;
    }
    
    public static Integer devuelveInteger(Integer parametro){
        System.out.println("Introduzca un parametro para devolverlo");
        Scanner leer = new Scanner(System.in);
        parametro = leer.nextInt();
        leer.close();
        return parametro;
    }
    public static void mensaje(String msg){
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un Mensaje para devolver");
        msg = leer.next();
        System.out.println(msg);
    }
    

    public static void main(String[] args) {
        
        String[] menu= {"kdsksnv", "String", "int","mensaje" , "salir"};
        Function<String,String> metodo= GeneradorDeMenus::devuelveString;
        String parametro="asd";
        MetodoDevuelve.añadirMetodo(1, metodo);
        Function<Integer,Integer> metodo2 = GeneradorDeMenus::devuelveInteger;
        MetodoDevuelve.añadirMetodo(2, metodo2);
        Consumer<String> metodo3 = GeneradorDeMenus::mensaje;
        MetodoVoid.añadirMetodo(3, metodo3);
        chichaMenu(menu, parametro);
        
    }
}

    