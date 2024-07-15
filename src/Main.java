import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boas vindas ao sistema de cadastro de estudantes!");
        System.out.println("-------------------------------------------------");

        while (true) {
            System.out.println("Digite o nome do aluno:");
            estudante.setNome(scanner.nextLine());

            System.out.println("Digite o sobrenome do aluno:");
            estudante.setSobrenome(scanner.nextLine());

            System.out.println("Digite o nome da rua do aluno:");
            estudante.setEndereco(scanner.nextLine());

            System.out.println("Digite a idade do aluno:");
            estudante.setIdade(Integer.parseInt(scanner.nextLine()));

            System.out.println("nome: " + estudante.getNome());
            System.out.println("sobrenome: " + estudante.getSobrenome());
            System.out.println("endereco: " + estudante.getEndereco());
            System.out.println("idade: " + estudante.getIdade());
            System.out.println("---------------------------------------");

            System.out.println("Deseja cadastrar outro aluno ? (sim/nao)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("nao")) {
                break; // Sai do loop
            }
        }

        scanner.close();
    }
}