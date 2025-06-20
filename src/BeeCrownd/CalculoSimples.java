package BeeCrownd;
import java.util.Scanner;

//Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
//Entrada
//
//O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
//Saída
//
//A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

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
