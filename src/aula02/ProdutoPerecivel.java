package aula02;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }


    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Banana", 9.19, 8, "24/07/2025");
        System.out.println(produtoPerecivel1);
    }
}
