import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ListaProdutos {

    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();
        int numeroEscolhido = 0;

        do {
            System.out.println("================================");
            System.out.println("          MENU PRINCIPAL        ");
            System.out.println("================================");
            System.out.println("1 - Adicionar um novo produto");
            System.out.println("2 - Verificar se o produto já está na lista");
            System.out.println("3 - Listar todos os produtos do estoque");
            System.out.println("4 - Atualizar quantidade do produto");
            System.out.println("5 - Remover produto do estoque");
            System.out.println("6 - Sair");
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
                        System.out.println("Digite o novo Produto: ");
                        String produto = scanner.nextLine();
                        if (estoque.containsKey(produto)) { // adicionar Produto na lista
                            System.out.println("Produto cadastrado!");
                        } else {
                            System.out.println("Quantidade do produto: ");
                            int quantidadeInicial = scanner.nextInt();
                            scanner.nextLine();
                            estoque.put(produto, quantidadeInicial);
                            System.out.println("Produto cadastrado com sucesso.");
                        }
                        break;

                    case 2:
                        System.out.println("--Verificação de nome na lista--");
                        System.out.println("Digite o nome para conferência");
                        String nameConference = scanner.nextLine();
                        if (estoque.containsKey(nameConference)) {
                            System.out.println("Quantidade em estoque de '" + nameConference + "': " + estoque.get(nameConference));
                        } else {
                            System.out.println("Este produto ainda não foi cadastrado!");
                        }
                        break;
                    case 3:
                        System.out.println("--Lista de Nomes--");
                        if (estoque.isEmpty()) { // isEmpty para mostrar todos do array
                            System.out.println("Não há nenhum nome cadastrado: ");
                        } else {
                            System.out.println("Lista: ");
                            for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
                                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Nome do produto: ");
                        String nomeAtualiza = scanner.nextLine();
                        if (estoque.containsKey(nomeAtualiza)) {
                            System.out.print("Nova quantidade: ");
                            int novaQtd = scanner.nextInt();
                            scanner.nextLine(); // limpa o buffer
                            estoque.put(nomeAtualiza, novaQtd);
                            System.out.println("Quantidade atualizada.");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                        break;

                    case 5:
                        System.out.print("Nome do produto: ");
                        String nomeRemove = scanner.nextLine();
                        if (estoque.containsKey(nomeRemove)) {
                            estoque.remove(nomeRemove);
                            System.out.println("Produto removido.");
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                        break;
                    
                    case 6:
                       System.out.println("Fehando!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido");
                scanner.nextLine();
            }
        }while (numeroEscolhido != 6); 
}}
