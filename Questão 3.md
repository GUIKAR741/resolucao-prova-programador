# Questão 3

> Selecione as respostas corretas:

a. Qual o resultado quando o seguinte fragmento de código for executado?

```java
int a = 8;
int b = 3;
float f = a++/b--;
System.out.println( f );
```

D) 2.6

b. O que acontece ao tentar compilar e executar o seguinte código?

```java
public class TestEqual {
    public static void main(String args[]) {
        Integer i = new Integer(7);
        Long l = new Long(7);
        System.out.println(l.equals(i));
    }
}
```

B. imprimirá - false

c. Dado o trecho de código abaixo, escreva um código em Java que imprima
apenas os nomes que começa com "ana" (case insensitive, ou seja, maiúsculas e
minúsculas não devem fazer diferença). (User caracterista Java 8 ou superior será
considerado bônus)

```java
List<String> nomes = Arrays.asList(
    "Ana Carla",
    "João Carlos",
    "Mário Augusto",
    "Reberto Ana Nascimento",
    "ana Maria",
    "Sophia ana"
);
```

```java
nomes = nomes.stream().filter(
    (String s) -> s.toLowerCase().contains("ana")
).collect(Collectors.toList());
nomes.forEach(System.out::println);
```

d. Dado o trecho de código abaixo, utilize Lambda Expressions introduzido no Java
8 para reduzir a quantidade de código digitado. (Utilizar outras caracteristicas a mais do
Java 8 ou superior será considerado com bônus)

```java
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}).start();
```

```java
new Thread(() -> System.out.println("Hello world!")).start();
```
