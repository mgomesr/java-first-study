package firstWeek.Atividade;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;

		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado com sucesso!");
			
		} while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com " + candidato +" na " + tentativasRealizadas + " tentativa");
		else
			System.out.println("Não conseguimos contato com " + candidato +", número máximo tentativas " + tentativasRealizadas + " realizadas");
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3) == 1;	
	}

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de número: " + (i + 1) + " é o " + candidatos[i]);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double baseSalarial = 4119.50;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double pretensaoSalarial = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salário R$: " + pretensaoSalarial);
            if (baseSalarial >= pretensaoSalarial) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(3000, 5000);
    }

    static void analisarCandidado(double pretensaoSalarial) {
        double baseSalarial = 4119.50;

        if (baseSalarial > pretensaoSalarial) {
            System.out.println("Ligar para o candidato.");
        } else if (baseSalarial == pretensaoSalarial) {
            System.out.println("Ligar para o candidado, com contra proposta.");
        } else {
            System.out.println("Aguardando resultado dos demais candidados.");
        }
    }
}
