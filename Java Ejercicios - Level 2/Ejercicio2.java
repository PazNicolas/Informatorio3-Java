/*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).*/

import java.util.*;

public class Ejercicio2 {
    public static void main(String args[]) {
        List<String> numeros = new ArrayList<String>();
        numeros.add("50");
        numeros.add("35");
        numeros.add("25");
        numeros.add("18");
        numeros.add("13");
        System.out.println("Lista de numeros inicial:\n"
                + numeros);
        numeros.add(0, "75");
        numeros.add("7");
        System.out.println("Lista con agregados en el primer y ultimo lugar:\n"
                + numeros);
    }
}
