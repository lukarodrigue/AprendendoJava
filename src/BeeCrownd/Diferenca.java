package BeeCrownd;

//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
//Entrada
//
//O arquivo de entrada contém 4 valores inteiros.
//Saída
//
//Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Primeiro numero: ");
        int A = input.nextInt();

        System.out.print("Digite o Segundo numero: ");
        int B = input.nextInt();

        System.out.print("Digite o Terçeiro numero: ");
        int C = input.nextInt();

        System.out.print("Digite o Quarto numero: ");
        int D = input.nextInt();


        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
