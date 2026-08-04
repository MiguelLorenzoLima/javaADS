package javaADS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidadorIdade {
    public static void main(String[] args) {
       
       try{
        Scanner numero = new Scanner (System.in);


        System.out.println( "Digite a sua idade: ");
        int idade = numero.nextInt();
       
        if(idade < 18){
            System.out.println("Você é menor de idade");
        }else if (idade >= 60){
            System.out.println("Você é idoso");
        }else{
            System.out.println("Você está na flor da idade");
            
        }
   
        numero.close();
       } catch (InputMismatchException  e){ // esse aqui é pra usuário burro que coloca valores inválidos
        System.out.println("Digite um número válido");
       } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        }
     }
}
