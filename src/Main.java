import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Cadastro de Clientes");

        System.out.print("Digite o nome do cliente: ");

        String nome = scanner.nextLine();

        System.out.println("Cliente cadastrado: " + nome);

    }
}