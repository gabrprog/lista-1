import java.util.Scanner;

public class Ex05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = leitor.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int b = leitor.nextInt();

        System.out.println("Valores originais: A = " + a + ", B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados: A = " + a + ", B = " + b);

        
    }
}
