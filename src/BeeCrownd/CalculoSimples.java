package BeeCrownd;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo da peca: ");
        int codigoPeca1 = scanner.nextInt();

        System.out.print("Digite o numero peca: ");
        int numeroPecas1 = scanner.nextInt();

        System.out.print("Digite o valor unitario: ");
        double valorUnitarioPeca1 = scanner.nextDouble();


        System.out.print("Digite o codigo da segunda peca: ");
        int numeroPecas2 = scanner.nextInt();

        System.out.print("Digite o valor unitario da segunda peca: ");
        double valorUnitarioPeca2 = scanner.nextDouble();


        double valorTotal = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
