
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {

        try {

            System.out.println("================================");
            System.out.println("          MENU PRINCIPAL        ");
            System.out.println("================================");
            System.out.println("1 - Área de um quadrado");
            System.out.println("2 - Área de um circulo");
            System.out.println("3 - Perímetro de um retângulo");
            System.out.println("4 - Sair");
            System.out.println("================================");
            System.out.print("Escolha uma opção: ");
            Scanner numero = new Scanner(System.in);

            System.out.println("Digite os números para acessar o menu: ");
            int a = numero.nextInt();

            switch (a){
                case 1 : System.out.println("Área do quadrado: ");
                    System.out.println("Digite o lado do quadrado: ");
                    int lado = numero.nextInt();
                    System.out.println("A área é = " + (lado * lado));
                break;

                case 2 : System.out.println("Área de um circulo: ");
                    System.out.println("Digite o raio: ");
                    int raio = numero.nextInt();
                    System.out.println("A área do circulo é = " + ((raio * raio) * 3.14));
                break;
                
                
                case 3 : System.out.println("Parímetro de um retângulo: ");
                    System.out.println("Digite o raio: ");
                    int lado1 = numero.nextInt();
                    int lado2 = numero.nextInt();
                    int lado3 = numero.nextInt();
                    int lado4 = numero.nextInt();
                    System.out.println("O perímetro do retangulo é  = " + (lado1 + lado2 + lado3 + lado4));
                break;

                default: System.out.println("vai dormir rapaz");
            }

            numero.close();

        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido.");
        }
    }

}
