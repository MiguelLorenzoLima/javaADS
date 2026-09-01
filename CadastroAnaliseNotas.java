
import java.util.Scanner;

public class CadastroAnaliseNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos da sala de aula: ");
        int quantidade = scanner.nextInt();
        double soma = 0;
        int aprovados = 0;
        double[] notas = new double[quantidade];
        double menor = 10;
        double maior = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a " + (1 + i) + "° nota: ");
            notas[i] = scanner.nextInt();
            soma += notas[i];

            if (notas[i] >= 6.0) {
                aprovados++;
            }

            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / quantidade;
        System.out.println("A média da turma é: " + media);
        System.out.println("A maior nota da sala é: " + maior);
        System.out.println("A pior nota foi: " + menor);
        System.out.println("O total de alunos aprovados foi de: " + aprovados);

    }
}
