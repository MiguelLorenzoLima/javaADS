package javaADS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       
       try{
        Scanner numero = new Scanner (System.in);


        System.out.println( "Digite o primeiro número: ");
        double a = numero.nextInt();
        
        System.out.println( "Digite o segundo número: ");
        double b = numero.nextInt();

        System.out.println("A soma é = " + (a + b));
        System.out.println("A subtração é = " + (a - b));
        System.out.println("A divisão é = " + (a / b));
        System.out.println("A multiplicação é = " + (a * b));
        System.out.println("O resto da divisão é = " + (a % b));

        numero.close();
       } catch (InputMismatchException  e){ // esse aqui é pra usuário burro que coloca valores inválidos
        System.out.println("Digite um número válido");
       } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        }
     }
}
