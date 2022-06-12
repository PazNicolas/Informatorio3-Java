import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Empleado {
    public String Nombre;
    public int DNI;
    public int horasTrabajadas;
    public int valorPorHora;

    public Empleado(int DNI, String Nombre, int horasTrabajadas, int valorPorHora) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return String.valueOf(this.DNI) +
                " - " + this.Nombre;
    }

}

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(36116185, "Nicolas", 8, 560));
        empleados.add(new Empleado(41233457, "Arturo", 8, 300));
        for (Empleado i : empleados) {
            sueldos.put(i.DNI, (i.horasTrabajadas * i.valorPorHora));
        }
        System.out.println("Sueldo para DNI 36116185: " + sueldos.get(36116185));
    }
}