/**
 Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío ("").
**/

import java.util.Arrays;
import java.util.Objects;

public class Ejercicio1 {
    public static void main(String[] args) {
        String[] palabras = { "Hola", null, null,
                "bienvenido", null, "al", "Informatorio", "2022", null };

        Arrays.stream(palabras)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
