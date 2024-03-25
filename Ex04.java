import java.util.Scanner;

public class Ex04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        
    }
}
