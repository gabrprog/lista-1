import java.util.Scanner;

public class Ex09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = leitor.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = leitor.nextInt();

        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            System.out.println("O maior número é: " + Math.max(a, b));
        }

        
    }
}
