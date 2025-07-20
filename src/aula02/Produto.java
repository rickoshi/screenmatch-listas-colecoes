package aula02;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preço=" + preco + ", quantidade=" + quantidade + "]";
    }


    public static void main(String[] args) {
        Produto produto1 = new Produto("Chocolate", 5, 2);
        Produto produto2 = new Produto("Leite", 4, 4);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Primeiro produto: " + produtos.get(0).getNome());
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produtos);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
