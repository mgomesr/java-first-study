package firstWeek.repetition;

public class ForCommand {
    public static void main(String[] args) {
        
        // For Comum
        for (int i = 0; i < 10; i++) {
            System.out.println("Essa é a repetição de índice " + i);
        }


        // For em Arrays
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno no índice x = " + i + " é " + alunos [i]);
        }


        // ForEach
        for (String nome : alunos) {
            System.out.println("Nome do aluno é: " + nome);
        }
    }
}
