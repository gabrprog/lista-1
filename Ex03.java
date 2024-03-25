import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leitor.nextInt();

        if (numero1 == numero2) {
            System.out.println("A sequência de números informada é inválida.");
        } else if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else {
            System.out.println(numero2 + " é maior que " + numero1);
        }

        
    }
}
