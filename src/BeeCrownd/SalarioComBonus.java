package BeeCrownd;


//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
//Entrada
//
//O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
//Saída
//
//Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

import java.util.Scanner;

public class SalarioComBonus {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionarios: ");
        String nomeFunc = input.nextLine();

        System.out.print("Digite o Salario fixo: ");
        double salarioFixo = input.nextDouble();

        System.out.print("Digite o valor da venda total: ");
        double vendaEfetuadas = input.nextDouble();

        // Calcula o salário
        double comissao = vendaEfetuadas * 0.15;

        double total = salarioFixo + comissao;

        System.out.printf("TOTAL = %.2f%n", total);

        input.close();
    }
}
