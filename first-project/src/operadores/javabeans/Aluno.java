package operadores.javabeans;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IllegalAccessException {
        if (idade < 0 || idade > 150)
            throw new IllegalAccessException("O valor da idade deve estar entre 1 a 150");

        this.idade = idade;
    }
}
