package recetas;
import java.util.HashSet;
import java.util.Scanner;
public class Test {
        public static void main(String[] args) {
            String bienvenida="Bienvenido a este programa donde podras:\n-Crear tus propias recetas\n-Introducir nuevos ingredientes\n-Ver los ingredientes y las recetas creadas hasta el momento";
            System.out.println(bienvenida);
            Scanner leer= new leer(System.in);
            
            HashSet<Receta> recetas= new HashSet<>();
            HashSet<Ingrediente> ingredientes= new HashSet<>();
            menuPrincipal(leer, ingredientes, recetas);
        }
    
        static void menuPrincipal(Scanner leer, HashSet<Receta> recetas, HashSet<Ingrediente> ingredientes){
            int introduccionUsuario;
            System.out.println("[1] Mostrar ingradientes\n" +
            "[2] Mostrar recetas\n" +
            "[3] Introducir nuevo Ingrediente\n" +
            "[4] Crear nueva Receta\n" +
            "[5] salir");
    
            introduccionUsuario= leer.nextInt();
    
            switch (introduccionUsuario) {
                case 1:
                    mostrarIngredientes();
                    break;
                case 2:
                    mostrarRecetas();
                    break;
                case 3:
                    crearIngrediente(ingredientes, leer);
                    break;
                case 4:
                    crearReceta();
                    break;
                case 5:
                    System.out.println("Aqui tienes los ingredentes y las recetas que has registrado");
                    System.out.println("Ingredientes:");
                    mostrarIngredientes();
                    System.out.println("Recetas:");
                    mostrarRecetas();
            }
        }
    
        //Metodo para introducir un nuevo ingrediente
        static void crearIngrediente(HashSet ingrediente, Scanner leer){
            String nombre= leer.nextLine();
            double precio = leer.nextDouble();
            Ingrediente i = new Ingrediente(nombre, precio);
    
            ingrediente.add(i);
        }
    
        //Metodo para crear una nueva receta
        static void crearReceta(){
            
        }
    
        //Metodo para listar los ingredientes registrados
        static void  mostrarIngredientes(){
    
        }
    
        //Metodo para listar las recetas registradas
        static void mostrarRecetas(){
    
        }
    }
    
