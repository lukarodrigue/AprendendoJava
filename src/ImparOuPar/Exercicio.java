package ImparOuPar;

import java.util.Scanner;

//(Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
//de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
public class Exercicio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;

        System.out.print("Digite Um Numero Inteiro: ");
        number1 = input.nextInt();

        int imparOuPar = number1;
        //Se a variavel dividida por 2 tiver o resto da divisão 0
        if (imparOuPar % 2 == 0) {
            System.out.printf("Seu numero é Par: %d", imparOuPar);
        } else {
            System.out.printf("Seu numero é Impar: %d", imparOuPar);
        }
    };
}
