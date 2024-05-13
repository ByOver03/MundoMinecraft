package generador;

public class GeneradorDeMenus {
    public static void generaMenus(int cantidadOpciones, String[] menu){
        menu= new String[cantidadOpciones];
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
}
