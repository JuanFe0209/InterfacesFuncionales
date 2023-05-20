import java.util.function.Supplier;

public class EjemploSupplier {
    public static void main(String[] args) {
        Supplier<String> mensajeSupplier = () -> "Hola mi nombre es Juan Felipe";
        String mensaje = mensajeSupplier.get();
        System.out.println(mensaje);
    }
}

