package BeeCrownd;


//Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
//
//Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
//Entrada
//
//O arquivo de entrada contém três valores inteiros.
//Saída
//
//Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("DIGITE O PRIMEIRO NUMERO: ");
        int A = input.nextInt();

        System.out.print("DIGITE O SEGUNDO NUMERO: ");
        int B = input.nextInt();

        System.out.print("DIGITE O TERCEIRO NUMERO: ");
        int C = input.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.println(maiorABC + " é maior");
    }
}
