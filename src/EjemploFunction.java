import java.util.function.Function;

class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private double saldo;

    public Cliente(String nombre, String apellido, int edad, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class EjemploFunction {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Felipe", 20, 5000000);

        Function<Cliente, String> mostrarSaldo = c -> "El saldo de " + c.getNombre() + " " + c.getApellido() + " " + "con" + " " + c.getEdad()+ " " + "años de edad es $" + c.getSaldo();

        System.out.println(mostrarSaldo.apply(cliente));
    }
}

