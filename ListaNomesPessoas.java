import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaNomesPessoas {

    public static void main(String[] args) {

        HashSet<String> arrayNames = new HashSet<>();
        int numeroEscolhido = 0;

        do {
            System.out.println("================================");
            System.out.println("          MENU PRINCIPAL        ");
            System.out.println("================================");
            System.out.println("1 - Adicionar um novo nome");
            System.out.println("2 - Verificar se o nome já está na lista");
            System.out.println("3 - Listar todos os nomes cadastrados");
            System.out.println("4 - Exibir quantidade de nomes inseridos");
            System.out.println("5 - Sair");
            System.out.println("================================");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Digite um número para acessar o menu: ");
                numeroEscolhido = scanner.nextInt();
                scanner.nextLine();

                switch (numeroEscolhido) {
                    case 1:
                        System.out.println("--Adicionar um novo nome na lista--");
                        System.out.println("Digite o novo nome: ");
                        String name = scanner.nextLine();
                        if (arrayNames.add(name)) { // adicionar nome na lista
                            System.out.println("Nome cadastrado!");
                        } else {
                            System.out.println("Nome inválido!");
                        }
                        break;

                    case 2:
                        System.out.println("--Verificação de nome na lista--");
                        System.out.println("Digite o nome para conferência");
                        String nameConference = scanner.nextLine();
                        if (arrayNames.contains(nameConference)) {
                            System.out.println("Este nome ja foi cadastrado!");
                        } else {
                            System.out.println("Este nome ainda não foi cadastrado!");
                        }
                        break;
                    case 3:
                        System.out.println("--Lista de Nomes--");
                        if (arrayNames.isEmpty()) { // isEmpty para mostrar todos do array
                            System.out.println("Não há nenhum nome cadastrado: ");
                        } else {
                            System.out.println("Lista: ");
                            for (String n : arrayNames) {
                                System.out.println("-" + n);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("--Exibir a quantidade de nomes na lista--");
                        System.out.println("Total de nomes na lista: " + arrayNames.size());
                        break;

                    case 5:
                        System.out.println("--Peograma Fechado--");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Obrigado!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido");
                scanner.nextLine();
            }
        }while (numeroEscolhido != 5); 
}}
