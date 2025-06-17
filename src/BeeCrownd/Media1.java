package BeeCrownd;

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro valor flutuante: ");
        double A = input.nextDouble();

        System.out.print("Insira o Segundo valor flutuante: ");
        double B = input.nextDouble();

        double result = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", result);

    }
}
