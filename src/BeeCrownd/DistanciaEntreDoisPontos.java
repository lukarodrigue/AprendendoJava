package BeeCrownd;



//Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:
//
//Distancia =
//Entrada
//
//O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.
//Saída
//
//Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.


import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE O PRIMEIRO NUMERO: ");
        double x1 = scanner.nextDouble();

        System.out.print("DIGITE O SEGUNDO NUMERO: ");
        double y1 = scanner.nextDouble();

        System.out.print("DIGITE O TERÇEIRO NUMERO: ");
        double x2 = scanner.nextDouble();

        System.out.print("DIGITE O QUARTO NUMERO: ");
        double y2 = scanner.nextDouble();


        double diferencaX = x2 - x1;
        double diferencaY = y2 - y1;


        double distancia = Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));


        System.out.printf("%.4f%n", distancia);

    }
}
