package firstWeek;
public class Conditionals {
    public static void main(String[] args) {
        
        // Condição Simples
        double saldo = 25;
        double valorSolicitado = 17;

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        }

        System.out.println(saldo);


        // Condição Dupla
        double nota = 9.8;

        if (nota > 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }


        // Condição Encadeada
        double notaAluno = 5.8;

        if (notaAluno >= 7) {
            System.out.println("Aprovado!");
        } else if (notaAluno >=5 && notaAluno < 7) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }


        // Condição Ternária
        double alunoNota = 7.5;

        String resultado = alunoNota >= 6 ? "Aprovado!" : "Reprovado!";

        System.out.println(resultado);


        // Switch Case
        String plano = "MIDIA";

        switch (plano) {
            case "TURBO": {
                System.out.println("5GB YouTube");
            }
            case "MIDIA": {
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "BASIC": {
                System.out.println("100 minutos de ligação");
            }  
    

        }


    }
}