package stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //Interfaz STREAM
        //Un stream es una sucesion de operaciones

        //Tuberia o Pipeline
        //da un abanico mas amplio de operaciones
        //Son objetos que implementan la interface Stream
        //Las funciones stream son agregadas

        //"Stream<T> nombreStream = nombreColeccion.stream();"
        //"Stram<T> nombreStream = Stream.of(array)"
        //"Stram<T> nombreStream = Stream.of(valor1, valor2, ...)"
        /*Metodos
         *  - filter(Predicate<T>)
         *  -
         */
        List<String> lista = new ArrayList<>();
        lista.add("dado");
        lista.add("dados");
        lista.add("dardo");
        lista.add("Sabo");
        lista.add("Ace(Donut)");
        lista.add("Luffy");
        try{
        Stream<String> streamCadenas= lista.stream();
        //filter
        //Stream<T> filter(Predicate<? Super T>pred)
        Predicate<String> empiezaPorA = s -> s.startsWith("A");

        Stream<String> streamA= streamCadenas.filter(empiezaPorA);

        //IMPORTANTE
        //streamA.forEach(System.out::println);
        Consumer<String> mostrar = s-> System.out.println(s);
        streamA.forEach(mostrar);

        streamCadenas.filter(s->s.startsWith("d")).forEach(System.out::println);;
    }catch(IllegalStateException e){
        System.out.println("no furulara mas");
    }catch(Exception e){
        System.out.println("no furula");
    }
    }
}
