package recetas;
import java.util.HashSet;
import java.util.Scanner;
public class Test {
        public static void main(String[] args) {
            String bienvenida="Bienvenido a este programa donde podras:\n-Crear tus propias recetas\n-Introducir nuevos ingredientes\n-Ver los ingredientes y las recetas creadas hasta el momento";
            System.out.println(bienvenida);
            Scanner leer= new Scanner(System.in);
            
            HashSet<Receta> recetas= new HashSet<>();
            HashSet<Ingrediente> ingredientes= new HashSet<>();
            menuPrincipal(leer, recetas, ingredientes);
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
                    mostrarIngredientes(leer);
                    break;
                case 2:
                    mostrarRecetas(leer);
                    break;
                case 3:
                    crearIngrediente(ingredientes, leer);
                    break;
                case 4:
                    crearReceta(leer, recetas);
                    break;
                case 5:
                    System.out.println("Aqui tienes los ingredentes y las recetas que has registrado");
                    System.out.println("Ingredientes:");
                    mostrarIngredientes(leer);
                    System.out.println("Recetas:");
                    mostrarRecetas(leer);
            }
        }
    
        //Metodo para introducir un nuevo ingrediente
        static void crearIngrediente(HashSet<Ingrediente> ingrediente, Scanner leer){
            System.out.println("Introduzca el nombre del ingrediente:");
            String nombre= leer.next();
            System.out.println("Introduzca el precio del ingrediente");
            double precio = leer.nextDouble();
            Ingrediente i = new Ingrediente(nombre, precio);
    
            ingrediente.add(i);
            
        }
    
        //Metodo para crear una nueva receta
        static void crearReceta(Scanner leer, HashSet<Receta> recetas){
            String respuesta;
            System.out.println();
            String nombre= leer.nextLine();
            int comensales= leer.nextInt();
            HashSet<Ingrediente> ingredientes = new HashSet<>();
            do{
            String nombrei = leer.nextLine();
            int precio = leer.nextInt();
            Ingrediente i = new Ingrediente(nombrei, precio);
            ingredientes.add(i);
            respuesta=leer.nextLine();
            respuesta = respuesta.toLowerCase();
            }while(respuesta.equals("si"));
            Receta r = new Receta(nombre, comensales, ingredientes);
            recetas.add(r);
            
        }
    
        //Metodo para listar los ingredientes registrados
        static void  mostrarIngredientes(Scanner leer){
            System.out.println("Como desea que le aparezcan los ingredientes?");
            System.out.println("[1] Ordenado alfabeticamente\n" +
            "[2] Ordenado por el precio\n" + 
            "[3] Volver atras");
        }
    
        //Metodo para listar las recetas registradas
        static void mostrarRecetas(Scanner leer){
            System.out.println("Como desea que le aparezcan las recetas?");
            System.out.println("[1] Ordenado alfabeticamente\n" +
            "[2] Ordenado por el precio\n" + 
            "[3] Volver atras");
        }
    }
    
