/*Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.
La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su funcionamiento.
En ejemplo se muestra solo con 1 Alumno a modo de abreviar
En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)
 */


import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Std {
    String apellido;
    String nombre;
    LocalDate fechNac;
    protected Std(String nombre , String apellido, LocalDate fechNac) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechNac = fechNac;
    }
    protected String getapellido() {
        return apellido;
    }
    protected void setapellido(String apellido) {
        this.apellido = apellido;
    }
    protected String getnombre() {
        return nombre;
    }
    protected void setnombre(String nombre) {
        this.nombre = nombre;
    }
    protected LocalDate getfechNac() {
        return fechNac;
    }
    protected void setfechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }
    protected Integer getAge() {
    	LocalDate hoy = LocalDate.now();
    	LocalDate cumple = fechNac;
    	Period diferencia = Period.between(cumple, hoy);
	return diferencia.getYears();
    }
}
public class Ejercicio5 {
    public static void main(String[] args) {

        List<Std> estudiantes = List.of(
                new Std("Nicolas", "Paz", LocalDate.of(1993,11,27)),
                new Std("Ivana", "Buittoni", LocalDate.of(1993,2,21)),
                new Std("Javier", "Escobar", LocalDate.of(1993,7,21)),
                new Std("Steve", "Rogers", LocalDate.of(1918,7,4)),
                new Std("Tobey", "Maguire", LocalDate.of(1975,6,27))
        );
        Map<String, Integer> mapStd = estudiantes.stream()
                .collect(Collectors.toMap(Stdnombre -> '\"'+Stdnombre.getapellido()+" "+Stdnombre.getnombre()+'\"',
                        StdAge -> StdAge.getAge()));
        System.out.println(mapStd);
    }
}