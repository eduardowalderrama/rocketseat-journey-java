package operadores.javabeans;

public class Objetos {
    public static void main(String[] args) throws IllegalAccessException {
        Aluno philip = new Aluno();
        philip.setNome("Philip Jones");
        philip.setIdade(-1);

        System.out.println(philip.getNome());
    }
}
