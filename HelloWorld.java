
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println( "Digite a nota do aluno: ");

        int a = entrada.nextInt();
        if (a  >= 7 ){
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
        entrada.close();
}
}