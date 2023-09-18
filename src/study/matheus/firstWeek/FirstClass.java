package edu.matheus.primeiraSemana;
public class FirstClass {
    public static void main(String[] args) {
        String firstName = "Matheus";
        String secondName = "Rodrigues";

        String nomeCompleto = nomeCompleto(firstName, secondName);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String firstName, String secondName) {
        return "Resultado " + firstName + " " + secondName;
    }
}
