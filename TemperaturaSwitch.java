
import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperaturaSwitch {
    public static void main(String[] args) {

        try {

            System.out.println("================================");
            System.out.println("          MENU PRINCIPAL        ");
            System.out.println("================================");
            System.out.println("1 - Coverter para Fahrenheit");
            System.out.println("2 - Converter para celsius");
            System.out.println("3 - Sair");
            System.out.println("================================");
            System.out.print("Escolha uma opção: ");
            Scanner numero = new Scanner(System.in);

            System.out.println("Digite algum número para acessar o menu: ");
            int a = numero.nextInt();

            switch (a){
                case 1 : System.out.println("Digite a temperatura: ");
                    int temp = numero.nextInt();
                    System.out.println("A temperatura é = " + ((temp * 1.8) + 32));
                break;

                case 2 : System.out.println("Digite a temperatura: ");
                    int temp2 = numero.nextInt();
                    System.out.println("A temperatura é = " + ((temp2 - 32 ) / 1.8));
                break;

                default: System.out.println("vai dormir rapaz");
            }

            numero.close();

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido.");
        }
    }

}
