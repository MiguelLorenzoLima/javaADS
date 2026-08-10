package javaADS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaNumerosWhile {
    public static void main(String[] args) {

        try {
            Scanner numero = new Scanner(System.in);
            int soma = 0;

            System.out.println("Digite os números para soma: ");
            int a = numero.nextInt();

            while (a != 0) {
                soma += a;

                System.out.println("Digite outro número (0 para sair): ");
                a = numero.nextInt();
            }

            System.out.println("A soma é = " + soma);

            numero.close();

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido.");
        }
    }
}