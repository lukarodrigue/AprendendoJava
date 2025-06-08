//2.24 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
//no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.

package InteirosMaiorEMenores;

import java.util.Scanner;

public class Exercicio224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inteiro1;
        int inteiro2;
        int inteiro3;
        int inteiro4;
        int inteiro5;

        System.out.print("DIGITE SEU PRIMEIRO INTEIRO: ");
        inteiro1 = input.nextInt();

        System.out.print("DIGITE SEU SEGUNDO INTEIRO: ");
        inteiro2 = input.nextInt();

        System.out.print("DIGITE SEU TERÇEIRO INTEIRO: ");
        inteiro3 = input.nextInt();

        System.out.print("DIGITE SEU QUARTO INTEIRO: ");
        inteiro4 = input.nextInt();

        System.out.print("DIGITE SEU QUINTO INTEIRO: ");
        inteiro5 = input.nextInt();

        System.out.printf("INTEIRO1: %d%n",inteiro1);
        System.out.printf("INTEIRO2: %d%n",inteiro2);
        System.out.printf("INTEIRO3: %d%n",inteiro3);
        System.out.printf("INTEIRO4: %d%n",inteiro4);
        System.out.printf("INTEIRO5: %d%n",inteiro5);

        // Encontrando o maior valor
        int maior = inteiro1;
        if (inteiro2 > maior) maior = inteiro2;
        if (inteiro3 > maior) maior = inteiro3;
        if (inteiro4 > maior) maior = inteiro4;
        if (inteiro5 > maior) maior = inteiro5;

        // Encontrando o menor valor
        int menor = inteiro1;
        if (inteiro2 < menor) menor = inteiro2;
        if (inteiro3 < menor) menor = inteiro3;
        if (inteiro4 < menor) menor = inteiro4;
        if (inteiro5 < menor) menor = inteiro5;

        System.out.printf("O maior inteiro é: %d%n", maior);
        System.out.printf("O menor inteiro é: %d%n", menor);
    }
}
