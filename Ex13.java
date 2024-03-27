import java.util.Scanner;

public class Ex13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = leitor.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = leitor.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = leitor.next().charAt(0);

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operador não definido!");
                System.exit(0);
        }

        System.out.println("Resultado: " + resultado);

    }
}
