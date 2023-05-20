import java.text.DecimalFormat;
import java.util.function.BiFunction;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

class IncrementoSalario {
    public double calcularNuevoSalario(Empleado empleado, double incremento) {
        return empleado.getSalario() * (1 + incremento);
    }
}

public class EjemploBiFunction {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Arle", 3000000);
        double incremento = 0.1;

        BiFunction<Empleado, Double, Double> aplicarIncrementoSalario = (e, i) -> {
            IncrementoSalario incrementoSalario = new IncrementoSalario();
            return incrementoSalario.calcularNuevoSalario(e, i);
        };

        double nuevoSalario = aplicarIncrementoSalario.apply(empleado, incremento);

        DecimalFormat df = new DecimalFormat("#,###");
        String salarioFormateado = df.format(nuevoSalario);

        System.out.println("El nuevo salario de " + empleado.getNombre() + " es: $" + salarioFormateado);
    }
}
