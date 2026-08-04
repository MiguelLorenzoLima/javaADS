package javaADS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorIdade {
    public static void main(String[] args) {
       
       try{
        Scanner numero = new Scanner (System.in);


        System.out.println( "Digite um número: ");
        int valor = numero.nextInt();

        System.out.println();
        for (int i = 1; i <=10; i++ ){
            System.out.println( valor * i  );

        }
   
        numero.close();
       } catch (InputMismatchException  e){ // esse aqui é pra usuário burro que coloca valores inválidos
        System.out.println("Digite um número válido");
       } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        }
     }
}
