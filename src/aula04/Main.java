package aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crie uma lista de números inteiros e utilize o method Collections.sort para ordená-la em ordem crescente.
        // Em seguida, imprima a lista ordenada.
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(5);
        listaInteiros.add(3);
        listaInteiros.add(8);
        listaInteiros.add(6);

        System.out.println(listaInteiros);
        Collections.sort(listaInteiros);
        System.out.println(listaInteiros);
        System.out.println();


        // 2. Crie uma classe Titulo com um atributo nome do tipo String.
        // Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.


        // 3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
        // Utilize o method Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
        Titulo titulo1 = new Titulo("João");
        Titulo titulo2 = new Titulo("Maria");
        Titulo titulo3 = new Titulo("André");

        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        System.out.println("Lista de nomes");
        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }
        System.out.println();

        Collections.sort(listaTitulos);
        System.out.println("Lista de nomes ordenada");
        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }
        System.out.println();


        // 4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
        // Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
        List<String> listaArray = new ArrayList<>();
        listaArray.add("A");
        listaArray.add("G");
        listaArray.add("E");
        System.out.println(listaArray);

        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("C");
        listaLinked.add("J");
        listaLinked.add("F");
        System.out.println(listaLinked);
        System.out.println();


        // 5. Modifique o Exercício 4 para declarar a variável de lista como a interface List,
        // demonstrando o uso de polimorfismo.
        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Item 1");
        listaPolimorfica.add("Item 2");
        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Item A");
        listaPolimorfica.add("Item B");
        System.out.println(listaPolimorfica);
    }
}
