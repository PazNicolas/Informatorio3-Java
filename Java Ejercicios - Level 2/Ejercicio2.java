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
