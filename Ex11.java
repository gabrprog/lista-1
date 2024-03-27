import java.util.Scanner;

public class Ex11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = leitor.nextInt();

        int menor = Math.min(Math.min(numero1, numero2), numero3);
        int maior = Math.max(Math.max(numero1, numero2), numero3);
        int meio = numero1 + numero2 + numero3 - menor - maior;

        System.out.println("Em ordem crescente: " + menor + ", " + meio + ", " + maior);

       
    }
}
