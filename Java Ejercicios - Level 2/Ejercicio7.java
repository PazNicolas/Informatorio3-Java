/* Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 */


public class Ejercicio7 {
    public static String[] fizzBuzzFuncion(int a, int b) {
        String out = "";
        String n = "";
        for (int i = a; i < b - 1; i++) {
            n = String.valueOf(i);
            if (i % 2 == 0)
                n = "Fizz";
            if (i % 3 == 0)
                n = "Buzz";
            if (i % 2 == 0 && i % 3 == 0)
                n = "FizzBuzz";
            out = out + " " + n;
        }
        out = out + " " + String.valueOf(b - 1);
        return out.split(" ");
    }

    public static void main(String[] args) {
        String[] Fizz = fizzBuzzFuncion(1, 8);
        System.out.print("[");
        for (String string : Fizz) {
            System.out.print(" " + string);
        }
        System.out.print(" ]");
        System.out.println();
    }
}