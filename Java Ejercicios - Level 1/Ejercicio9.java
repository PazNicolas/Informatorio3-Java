import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            String texto;
            char caracter;
            int numeroDeVeces = 0;
            do {
                System.out.println("Introducir texto: ");
                texto = sc.nextLine();
            } while (texto.isEmpty());
            System.out.print("Introducir letra a contar: ");
            caracter = (char) System.in.read();
            numeroDeVeces = contarCaracteres(texto, caracter);
            System.out.println("La letra " + caracter + " aparece " + numeroDeVeces + " veces");
        }
    }

    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }
}