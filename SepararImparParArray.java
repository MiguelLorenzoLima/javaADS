package javaADS;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SepararImparParArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int contaPares = 0;
        int contaImpares = 0;

        ArrayList<Integer> indicesPares = new ArrayList<>();
        ArrayList<Integer> indicesImpares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    System.out.print("Digite o " + (i + 1) + "° número: ");
                    numeros[i] = scanner.nextInt();
                    entradaValida = true;

                    if (numeros[i] % 2 == 0) {
                        contaPares++;
                        indicesPares.add(numeros[i]);
                    } else{
                        contaImpares++;
                        indicesImpares.add(numeros[i]);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    scanner.next();
                }
            }
        }
        System.out.println("o Array de Pares: " + indicesPares);
        System.out.println("o quantidade de Pares no array: " + contaPares);
        System.out.println("o Array de Pares: " + indicesImpares);
        System.out.println("o quantidade de Pares no array: " + contaImpares);
        scanner.close();
    }
}