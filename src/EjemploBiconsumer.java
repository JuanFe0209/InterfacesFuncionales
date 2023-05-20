import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

    class EjemploBiConsumer {
        public static void main(String[] args) {
            List<String> list1 = Arrays.asList("Carro", "Moto", "avión");
            List<Integer> list2 = Arrays.asList(1, 2, 3);

            List<String> result = new ArrayList<>();

            BiConsumer<String, String> biConsumer = (s1, s2) -> result.add(s1 + " " + s2);

            int minLength = Math.min(list1.size(),(list2.size()));
            for (int i = 0; i < minLength; i++) {
                biConsumer.accept(list1.get(i), list2.get(i).toString());
            }

            System.out.println(result);
        }
    }


