package com.nando.estruturadados.exercicioPilha;

import com.nando.estruturadados.pilha.Pilha;

public class Exercicio03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<>(20);

        Livro livro = new Livro();
        livro.setNome("Learning JavaScript Data Structures and algorrithms ");
        livro.setAutor("Loiane Groner");
        livro.setAnolLancamento(2014);
        livro.setIsbn("B01C2XX8Y2");

        Livro livro1 = new Livro();
        livro1.setNome("Learning JavaScript Data Structures and algorrithms - Second Edition");
        livro1.setAutor("Loiane Groner");
        livro1.setAnolLancamento(2016);
        livro1.setIsbn("B00OYTCT02");

        Livro livro2 = new Livro();
        livro2.setNome("Mastering Ext JS - Second Edition");
        livro2.setAutor("Loiane Groner");
        livro2.setAnolLancamento(2015);
        livro2.setIsbn("B00U01QQWU");

        Livro livro3 = new Livro();
        livro3.setNome("JavaScript Regular Expressions");
        livro3.setAutor("Loiane Groner");
        livro3.setAnolLancamento(2015);
        livro3.setIsbn("B00YHBVHGO");

        System.out.println("Pilha de livro criada está vazia? " + pilha.estaVazia());

        System.out.println("Realiando o empilhamento dos livro na pilha.");

        pilha.empilha(livro);
        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);

        System.out.println( pilha.tamanho() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Pilha de livro criada está vazia? " + pilha.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilha.topo());

        System.out.println("Desempilhando livros da pilha:  " );

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhado, pilha vazia: " +pilha.estaVazia());

    }

}
