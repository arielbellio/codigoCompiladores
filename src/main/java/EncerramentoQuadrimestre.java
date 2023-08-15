import java.util.Scanner;

public class EncerramentoQuadrimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        
        for (int i = 1; i <= quantidadeAlunos; i++) {
            scanner.nextLine(); 
            System.out.print("Digite o nome do aluno " + i + ": ");
            String nomeAluno = scanner.nextLine();
            
            System.out.print("Digite a nota do aluno " + nomeAluno + ": ");
            double nota = scanner.nextDouble();
            
            if (nota >= 5.0) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }
        scanner.close();
    }
}