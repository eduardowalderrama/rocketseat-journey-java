package operadores;

public class Operadores {
    public static void main(String[] args) {
        /**
         * Vamos imaginar que n1 comecaria com valor 10 e n2 com valor 5
         * mas em seguida gostaria de somar o valor de n1 e n2 e atribuir a n2.
         */
        int n1 = 10;
        int n2 = 5;

        //forma literal
        n2 = n2 + n1;
        //forma abreviada
        n2 += n1;
        System.out.println(n2);

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);

        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println(concatenacao);
    }
}
