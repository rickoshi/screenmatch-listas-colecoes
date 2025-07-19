package aula01;

public class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "Nome: " + this.nome + " (Idade: " + this.idade + ")";
    }
}
