
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número positivo: ");
        int digito = scanner.nextInt();
        String strDigito = Integer.toString(digito);
        int contador = 0;
        for(int i = 0; i < strDigito.length(); i++);{
            contador++;
        }
        System.out.println("A quantidade de digitos é: " + contador);
        System.out.println("A quantidade de digitos é: " + (strDigito.length()));
        scanner.close();
    }
}
