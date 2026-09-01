

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValdidarEntrada {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            try {
                System.out.print("Digite um número (-1 para sair): ");
                numero = scanner.nextInt();

                if (numero == -1) {
                    System.out.println("Cábô!");
                } else if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é PAR.");
                } else {
                    System.out.println("O número " + numero + " é ÍMPAR.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
                numero = 0;
            }

        } while (numero != -1);

        scanner.close();
    }
}
