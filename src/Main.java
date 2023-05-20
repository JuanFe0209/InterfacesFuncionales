import java.util.ArrayList;
import java.util.List;

public class Main {  public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();
    nombres.add("Juan");
    nombres.add("Arle");
    nombres.add("Daniel");
    nombres.add("Luisa");

    EjemploConsumer ejemploConsumer = new EjemploConsumer();
    nombres.forEach(ejemploConsumer);
}
}
