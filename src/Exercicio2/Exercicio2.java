package Exercicio2;//package Exercicio2;
//
//public class Exercicio2 {
//    public static void main(String[] args) {
//        Exercicio 2.3
//         Escreva instruções para realizar cada uma das tarefas a seguir:
//
//         a) Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
//            int c;
//            int thisIsVariable;
//            int a76354;

//        b) Solicite que o usuário insira um inteiro.
//            System.out.print("Insira um numero inteiro: ");
//
//        c) Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler
//        um valor digitado pelo usuário.
//            value = input.nextInt();

//        d) Imprima “This is a Java program" em uma linha na janela de comando. Use o método System.out.println.

//          Systen.out.print("This is a Java program");

//        e) Imprima “This is a Java program" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o método
//        System.out.printf e dois especificadores de formato %s.
//
//          System.out.printf(“%s%n%s%n”, “This is a Java”, “program”);
//
//        f) Se a variável number não for igual a 7, exiba “The variable number is not equal to 7".
//
//            if(number != 7 ) {
//                System.out.printf("The variable number is not equal to 7")
//        }
//    }
//}

//2.5
//Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
//a) Declare que um programa calculará o produto de três inteiros.
// R: // Este programa calculará o produto de trẽs inteiros.

//b) Crie um Scanner chamado input que leia valores a partir da entrada padrão.
// R: Scanner input = input.nextInt()

//c) Declare as variáveis x, y, z e result como tipo int.
// R:    int x;
// R:    int y;
// R:    int z;
// R:    int result;

//d) Solicite que o usuário insira o primeiro inteiro.
// R:       System.out.printf("Insira o primeiro Numero: ");

//e) Leia o primeiro inteiro digitado pelo usuário e armazene-o na variável x.
// R:   x = input.nextInt();

//f) Solicite que o usuário insira o segundo inteiro.
// R:   System.out.printf("Insira o Segundo Numero: ");

//g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y.
// R: y = input.nextInt();

//h) Solicite que o usuário insira o terceiro inteiro.
// R: System.out.printf("Insira o terçeiro numero: ");

//i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
// R: z = input.nextInt();

//j) Compute o produto dos três inteiros contidos nas variáveis x, y e z e atribua o resultado à variável result.
// R: result = x * y * z;

//k) Use System.out.printf para exibir a mensagem “Product is” seguida pelo valor da variável result.
// R: System.out.printf("Product is: %d%n", result);

//2.6
//Usando as instruções que você escreveu no Exercício 2.5, elabore um programa completo que calcule e imprima o produto de três inteiros.
//R: import java.util.Scanner;
// public class Calc {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in); // Declara o Scanner apenas uma vez!
//
//        int x, y, z, result;
//
//        // Primeiro exibe a mensagem, depois lê o input:
//        System.out.print("Digite seu primeiro inteiro: ");
//        x = input.nextInt();
//
//        System.out.print("Digite seu segundo inteiro: ");
//        y = input.nextInt();
//
//        System.out.print("Digite seu terceiro inteiro: ");
//        z = input.nextInt();
//
//        result = x * y * z;
//
//         System.out.printf("Resultado é %d%n", result);
//     }
// }

//Escreva um aplicativo que exiba os números 1 a 4 na mesma linha, com cada par de adjacentes separados por um espaço. Use as seguintes
//técnicas:

//public class Exercicio2 {
//    public static void main(String[] args) {
        //a) Uma instrução System.out.println.
//        System.out.println("1 2 3 4 ");

        //b) Quatro instruções System.out.print.
//        System.out.print("1 ");
//        System.out.print("2 ");
//        System.out.print("3 ");
//        System.out.print("4 \n");


        //c) Uma instrução System.out.printf.
//        System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
//    }
//}

//2.15(Aritmética) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,
//diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7.

//import java.util.Scanner;
//
//public class Exercicio2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int inteiro1;
//        int inteiro2;
//
//        int resultado;
//
//        System.out.print("Insira o primeiro Inteiro: ");
//        inteiro1 = input.nextInt();
//
//        System.out.print("Insira o segundo Inteiro? ");
//        inteiro2 = input.nextInt();
//
//        resultado = inteiro1 + inteiro2;
//        System.out.printf("Sua soma e : %d%n", resultado);
//
//        resultado = inteiro1 - inteiro2;
//        System.out.printf("Sua Subtracao e : %d%n", resultado);
//
//        resultado = inteiro1 * inteiro2;
//        System.out.printf("Sua Multiplicacao e : %d%n", resultado);
//
//        resultado = inteiro1 / inteiro2;
//        System.out.printf("Sua divisao e : %d%n", resultado);
//
//    }
//}

//2.16(Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir dois inteiros, obtenha dele esses números e exiba o número
//maior seguido pelas palavras “is larger". Se os números forem iguais, imprima a mensagem “These numbers are equal". Utilize
//as técnicas mostradas na Figura 2.15.

//import java.util.Scanner;
//
//public class Exercicio2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Insira o primeiro inteiro: ");
//        int inteiro1 = input.nextInt();
//
//        System.out.print("Insira o segundo inteiro: ");
//        int inteiro2 = input.nextInt();
//
//        if (inteiro1 == inteiro2) {
//            System.out.printf("These numbers are equal (%d == %d)%n", inteiro1, inteiro2);
//        }
//        else if (inteiro1 > inteiro2) {
//            System.out.printf("%d is larger than %d%n", inteiro1, inteiro2);
//        }
//        else {
//            System.out.printf("%d is larger than %d%n", inteiro2, inteiro1);
//        }
//    }
//}

//2.17(Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros digitados pelo usuário e exiba a soma, média, produto e os
//números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média neste exercício deve resultar
//em uma representação de inteiro. Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]

//import java.util.Scanner;
//
//public class Exercicio2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro número: ");
//        int number1 = input.nextInt();
//
//        System.out.print("Digite o segundo número: ");
//        int number2 = input.nextInt();
//
//        System.out.print("Digite o terceiro número: ");
//        int number3 = input.nextInt();
//
//        // Cálculos básicos
//        int soma = number1 + number2 + number3;
//        int media = soma / 3; // Média inteira conforme enunciado
//        int produto = number1 * number2 * number3;
//
//        // Encontrando o maior número
//        int maior = number1;
//        if (number2 > maior) {
//            maior = number2;
//        }
//        if (number3 > maior) {
//            maior = number3;
//        }
//
//        // Encontrando o menor número
//        int menor = number1;
//        if (number2 < menor) {
//            menor = number2;
//        }
//        if (number3 < menor) {
//            menor = number3;
//        }
//
//        // Exibindo resultados
//        System.out.printf("Soma: %d%n", soma);
//        System.out.printf("Média: %d%n", media);
//        System.out.printf("Produto: %d%n", produto);
//        System.out.printf("Menor número: %d%n", menor);
//        System.out.printf("Maior número: %d%n", maior);
//    }
//}