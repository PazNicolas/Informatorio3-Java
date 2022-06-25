
/*
Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).
 */
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> supers = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac", "Banshee",
                "Batwing", "bestia", "bishop", "Bruja Escarlata");
        List<String> filtro = supers.stream()
                .filter(firstLetter -> firstLetter.startsWith("B") || firstLetter.startsWith("b"))
                .collect(Collectors.toList());
        System.out.println(filtro.size());
    }
}