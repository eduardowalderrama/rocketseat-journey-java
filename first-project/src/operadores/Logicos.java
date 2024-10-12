package operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1=true;
        boolean condicao2=false;

        /**
         * Aqui estamos utilizando o operador logico E para fazer a uniao de duas
         * expressoes.
         * Eh como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar codigo"
         */
        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        //Se condicao1 OU condicao2 for verdadeira, executar codigo.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        int numero1 = 1;
        int numero2 = 1;

        if(numero1== 2 & numero2 ++ == 2)
            System.out.println("As 2 condicoes sao verdadeiras");

        System.out.println("O numero 1 agora eh " + numero1);
        System.out.println("O numero 2 agora eh " + numero2);
    }
}
