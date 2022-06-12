/*Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas*/

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int i, m, n, producto;
        producto = 0;
        System.out.print("Ingresa el valor de m: ");
        try (Scanner in = new Scanner(System.in)) {
            m = in.nextInt();
            in.nextLine();
            System.out.print("Ingresa el valor de n: ");
            n = in.nextInt();
            in.nextLine();
        }
        for (i = 1; i <= n; i++) {
            producto = producto + m;
        }
        System.out.println("Valor de producto: " + producto);
    }

}
