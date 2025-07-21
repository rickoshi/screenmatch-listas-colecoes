package aula03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Crie um ArrayList de strings e utilize um loop foreach para percorrer
        // e imprimir cada elemento da lista.
        ArrayList<String> ListaDeStrings = new ArrayList<>();
        ListaDeStrings.add("Um");
        ListaDeStrings.add("Dois");
        ListaDeStrings.add("Três");
        for (String string : ListaDeStrings) {
            System.out.println(string);
        }
        System.out.println();


        // 2. Crie uma classe Animal e uma classe Cachorro que herda de Animal.
        // Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;


        // 3. Modifique o Exercício 2 para incluir uma verificação usando instanceof
        // para garantir que o objeto seja do tipo correto antes de fazer o casting.
        Animal bicho = new Cachorro();
        if (bicho instanceof Cachorro) {
            Cachorro doguinho = (Cachorro) bicho;
            System.out.println("Agora pode-se usar o objeto 'cachorro' como um Cachorro.");
        } else {
            System.out.println("Não é um cachorro.");
        }
        System.out.println();


        // 4. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos
        // e utilize um loop para calcular e imprimir o preço médio dos produtos.
        Produto produto1 = new Produto("Detergente", 2.50);
        Produto produto2 = new Produto("Sabonete", 1.50);
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        double somaDosPrecos = 0;
        for (Produto item : listaDeProdutos) {
            somaDosPrecos += item.getPreco();
        }
        System.out.println("Preço médio dos produtos: " + somaDosPrecos / listaDeProdutos.size());
        System.out.println();


        // 5. Crie uma interface Forma com um method calcularArea().
        // Implemente a interface em duas classes, por exemplo, Circulo e Quadrado.
        // Em seguida, crie uma lista de formas (objetos da interface Forma) e
        // utilize um loop para calcular e imprimir a área de cada forma.
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(4);
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma elemento : listaDeFormas) {
            System.out.println("Área da forma: " + elemento.calcularArea());
        }
        System.out.println();


        // 6. Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
        // Em seguida, crie uma lista de contas bancárias com diferentes saldos.
        // Utilize um loop para encontrar e imprimir a conta com o maior saldo.
        ContaBancaria conta1 = new ContaBancaria(123, 0);
        ContaBancaria conta2 = new ContaBancaria(456, 100);
        ContaBancaria conta3 = new ContaBancaria(789, 10000);
        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria maiorConta = listaDeContas.get(0);
        for (ContaBancaria contaAtual : listaDeContas) {
            if (contaAtual.getSaldo() > maiorConta.getSaldo()) {
                maiorConta = contaAtual;
            }
        }
        System.out.println("Número: " + maiorConta.getNumeroConta()+ "\nSaldo: " + maiorConta.getSaldo());
    }
}
