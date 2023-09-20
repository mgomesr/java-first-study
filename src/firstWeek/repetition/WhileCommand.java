package firstWeek.repetition;

public class WhileCommand {
    public static void main(String[] args) {

        int custo = 0;
        int preco = 5;
        
        while (custo < 50 ) {
            custo += preco;
            System.out.println("O gasto atual é R$ " + custo);
        }
        System.out.println("João gastou todo o dinheiro em doces");

    }
}
