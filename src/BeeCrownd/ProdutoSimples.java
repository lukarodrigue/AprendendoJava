package BeeCrownd;
//Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
//
//        Entrada
//O arquivo de entrada contém 2 valores inteiros.
//
//Saída
//Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = input.nextInt();

        System.out.print("Digite outro numero: ");
        int b = input.nextInt();

        int result  = a * b;

        System.out.println("PROD = " + result);
    }
}
