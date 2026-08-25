package javaADS;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscaEmArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Digite o " + (i + 1) + "° número: ");
                    numeros[i] = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    scanner.next();
                }
            }
        }
        System.out.print("Digite um número para busca no Array: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                indices.add(i); 
            }
        }
        if (indices.isEmpty()) {
            System.out.println("O número " + numero + " não existe no array.");
        } else {
            System.out.println("O número " + numero + " foi encontrado nas posições: " + indices);
        }

        scanner.close();
    }
}