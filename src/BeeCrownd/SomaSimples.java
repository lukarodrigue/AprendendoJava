package BeeCrownd;

//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
//        Entrada
//
//O arquivo de entrada contém 2 valores inteiros.
//Saída
//
//Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".


import java.util.Scanner;

public class SomaSimples {
    public static void  main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int a = input.nextInt();

        System.out.print("Digite outro valor inteiro: ");
        int b = input.nextInt();

        int resultado = a + b;

        System.out.println("SOMA = " + resultado);
    }
}
