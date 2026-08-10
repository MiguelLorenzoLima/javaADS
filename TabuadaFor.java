package javaADS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {

        try {
            Scanner numero = new Scanner(System.in);

            System.out.println("Digite o número da tabuada: ");
            int a = numero.nextInt();
            for (int i = 1; i<=10; i++){
                System.out.println((a) + " x " + (i) + " = " + (i * a) );
            }

            numero.close();
        } catch (InputMismatchException e) { // esse aqui é pra usuário burro que coloca valores inválidos
            System.out.println("Digite um número válido");
        }
    }
}
