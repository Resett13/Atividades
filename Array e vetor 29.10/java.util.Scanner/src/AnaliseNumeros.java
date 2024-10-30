import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            
            // Solicitar entrada de 10 números inteiros
            System.out.println("Adicione 10 numeros inteiros");
            for (int i = 0; i < 10; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
            
            int soma = 0;
            int maior = numeros[0];
            int menor = numeros[0];
            
            for (int num : numeros) {
                soma += num;
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }

            System.out.println("\nSoma de todos os valores: " + soma);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            
            System.out.println("\nValores inseridos:");
            for (int num : numeros) {
                if (num == maior) {
                    System.out.println(num + " Maior");
                } else if (num == menor) {
                    System.out.println(num + " Menor");
                } else {
                    System.out.println(num);
                }
            }
        }
    }
}
