package javaADS;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ListaComprasComArray {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto pelo nome");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Consultar se um produto está na lista");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha uma opção: \n\n\n\n");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Digite um número inteiro.\n\n");
                scanner.nextLine(); 
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String produto = scanner.nextLine();
                    lista.add(produto);
                    System.out.println("Produto adicionado.");
                    break;

                case 2:
                    System.out.print("Digite o nome do produto a remover: ");
                    String remover = scanner.nextLine();
                    if (lista.remove(remover)) {
                        System.out.println("Produto removido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:   //esta vazio
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        System.out.println("Produtos na lista:");
                        for (String produtos : lista) {
                            System.out.println("- " + produtos );
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do produto para consultar: \n\n");
                    String consulta = scanner.nextLine();
                    if (lista.contains(consulta)) {
                        System.out.println("O produto está na lista.\n\n");
                    } else {
                        System.out.println("O produto não está na lista.\n\n");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...\n\n");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha entre 1 e 5.\n\n");
            }
        } while (opcao != 5);

        scanner.close();
    }
}