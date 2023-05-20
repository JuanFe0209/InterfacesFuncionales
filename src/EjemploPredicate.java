import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class EjemploPredicate {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Felipe", 20);
        Estudiante estudiante2 = new Estudiante("Sofia", 21);
        Estudiante estudiante3 = new Estudiante("Daniel", 17);

        List<Estudiante> estudiantes = Arrays.asList(estudiante1, estudiante2, estudiante3);

        Predicate<Estudiante> esMayorDeEdad = e -> e.getEdad() >= 18;

        System.out.println("Estudiantes mayores de edad:");
        for (Estudiante estudiante : estudiantes) {
            if (esMayorDeEdad.test(estudiante)) {
                System.out.println(estudiante.getNombre());
            }
        }
    }
}
