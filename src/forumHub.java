import java.util.ArrayList;
import java.util.Scanner;

public class forumHub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> topicos = new ArrayList<>();

        System.out.println("Bem-vindo ao Fórum!");
        System.out.print("Digite seu nome de usuário: ");
        String usuario = scanner.nextLine();

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Criar tópico");
            System.out.println("2. Ver tópicos existentes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título do tópico: ");
                    String titulo = scanner.nextLine();
                    topicos.add(titulo);
                    System.out.println("Tópico criado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nTópicos existentes:");
                    for (String topico : topicos) {
                        System.out.println("- " + topico);
                    }
                    break;
                case 3:
                    System.out.println("Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

