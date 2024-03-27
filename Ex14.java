import java.util.Scanner;

public class Ex14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro termo da PA (a1): ");
        double a1 = leitor.nextDouble();

        System.out.println("Digite a razão da PA (r): ");
        double r = leitor.nextDouble();

        System.out.println("Digite o valor de n: ");
        int n = leitor.nextInt();

        double an = a1 + (n - 1) * r;

        System.out.println("O " + n + "-ésimo termo da PA é: " + an);

        
    }
}
