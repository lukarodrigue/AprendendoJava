import java.util.Scanner;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        // cria Scanner para obter entrada a partir da linha de comando
        Scanner entradaDeDados = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Digite seu numero inteiro: ");
        number1 = entradaDeDados.nextInt();

        System.out.print("Digite seu segundo numero inteiro: ");
        number2 = entradaDeDados.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == é igual á %d%n", number1, number2);
        }
        if (number1 != number2) {
            System.out.printf("%d != é não igual á %d%n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < é menor que %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > é maior que %d%n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= é menor que ou igual á %d%n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d >= é maior que ou igual á %d%n", number1, number2);
        }
    }
}