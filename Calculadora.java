package javaADS;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner (System.in);
        System.out.println( "Digite o primeiro número: ");

        Scanner numero2 = new Scanner (System.in);
        System.out.println( "Digite o segundo número: ");

        int a = numero1.nextInt();
        int b = numero2.nextInt();

        System.out.println("A soma é = " + (a + b));
        System.out.println("A subtração é = " + (a - b));
        System.out.println("A divisão é = " + (a / b));
        System.out.println("A multiplicação é = " + (a * b));
        System.out.println("O resto da divisão é = " + (a % b));

        }
}
