package edu.adriano.segundasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Adriano";
        String segundoNome = "Soares";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
