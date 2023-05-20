import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer implements Consumer<String> {
        @Override
        public void accept(String nombre) {
            System.out.println(nombre);
        }
    }

