import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExemplo {

    public static void main(String[] args) {
        // Adicionar e Exibir Elementos
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Melancia");
        frutas.add("Cereja");
        frutas.add("Uva");

        System.out.println("Frutas na lista: " + frutas);

        frutas.remove(3); // Remove a terceira fruta (Laranja)
        System.out.println("Frutas após remoção: " + frutas);

        // Buscar um Elemento
        String frutaParaBuscar = "Acerola";
        boolean existe = buscarFruta(frutas, frutaParaBuscar);
        System.out.println("A fruta " + frutaParaBuscar + " está na lista? " + existe);

        // Ordenar a Lista
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(1);
        numeros.add(4);

        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);


        List<Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(3);
        numerosInteiros.add(4);
        numerosInteiros.add(5);
        numerosInteiros.add(6);
        
        int countPares = contarPares(numerosInteiros);
        System.out.println("Total de números pares: " + countPares);
    }

    // Método para buscar uma fruta
    public static boolean buscarFruta(List<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    // Método para contar números pares
    public static int contarPares(List<Integer> numeros) {
        int count = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
