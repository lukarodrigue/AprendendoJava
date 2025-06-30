package Capitulo3;
import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAcount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAcount.getName());

        System.out.print("Please enter the name: ");
        String theName = input.nextLine();

        myAcount.setName(theName);

        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n", myAcount.getName());
    }
}
