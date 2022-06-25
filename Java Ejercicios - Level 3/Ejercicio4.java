/*Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación de factorial pero no se desean valores repetidos.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4, 5, 5, 5, 5, 6, 7);
        List<Integer> factor = numeros.stream()
                .map(factoriales -> factorial(factoriales))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(factor);
    }

    public static int factorial(int num) {
        if (num < 0) {
            System.out.print("No se puede resolver");
            return 0;
        } else if (num == 0) {
            return 1;
        } else {
            return num *= factorial(num - 1);
        }
    }
}