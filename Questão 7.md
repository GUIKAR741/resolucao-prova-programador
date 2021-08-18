# Questão 7

> Crie uma classe chamada Main com um método que receba 2 listas de Strings e retorne uma só lista contendo a junção das duas listas recebidas mas sem conter elementos repetidos, ou seja, se a mesma string estiver nas duas listas, a lista retornada não pode repetir esse elemento. A lista retornada deverá estar com os elementos ordenados em ordem alfabética.

```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    List<String> union(List<String> lista1, List<String> lista2) {
        LinkedList<String> lista = new LinkedList<>(lista1);
        lista2.forEach((String s) -> {
            if (!lista.contains(s)) lista.add(s);
        });
        lista.sort(
            Comparator.comparingInt(
                (String s) -> s.toLowerCase().charAt(0)
            )
        );
        return lista;
    }

    public static void main(String[] args) {
        Main principal = new Main();
        List<String> uniao = principal.union(
            Arrays.asList(
                "Ana Carla",
                "João Carlos",
                "Mário Augusto"
            ),
            Arrays.asList(
                "Mário Augusto", 
                "Reberto Ana Nascimento",
                "ana Maria",
                "Sophia ana"
            )
        );
        uniao.forEach(System.out::println);
    }
}
```
