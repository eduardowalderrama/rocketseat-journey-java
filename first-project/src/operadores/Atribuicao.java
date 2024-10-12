package operadores;

import java.util.Date;

public class Atribuicao {
    public static void main(String[] args) {
        String nome = "Abraham";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Doador de Orgao: " + doadorOrgao);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
