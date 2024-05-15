package primo;

public class Primo {
    static boolean esPrimer(Integer n){
        
        
        return false;
    }
    static Integer[] cienNumeros(){
        Integer[] almacenarNumeros= new Integer[100];
        for (int i = 0; i < 99; i++) {
            almacenarNumeros[i] =(int)(Math.random()*1000)+1;
        }
        return almacenarNumeros;
    }

    static Integer[] ordenarMayorMenor(Integer[] array){
        int n = array.length;
        int numero;
        
        for(int i = 0; i<n; i++){
            if(array[i]<array[i-1]){
                numero=array[i];
                array[i]= array [i-1];
                array[i-1] = numero;
            }
        }
        
    return array;
    }
}
