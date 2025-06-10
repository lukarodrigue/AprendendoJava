//2.26 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resul-
//tado. [Dica: utilize o operador de resto.]

package Multiplos;

import java.util.Scanner;

public class Exercicio226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Digite o Primeiro numero: ");
        number1 = input.nextInt();

        System.out.print("Digite o Segundo numero: ");
        number2 = input.nextInt();
    //verifica se o resto da divisão do number1 e number2 é igual a 0 se for ele é um multiplo se não, não!
         if (number1 % number2 == 0) {
             System.out.println(number1 + " é multipo do " + number2);
         } else {
             System.out.println(number1 + " não é multipo do " + number2);
         }
    }
}
