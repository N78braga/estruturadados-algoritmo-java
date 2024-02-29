package com.nando.estruturadados.exercicioPilha;

import com.nando.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Exercicio04 {

        public static void main(String[] args) {
            Stack<Livro> pilha = new Stack<>();

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

            System.out.println("Pilha de livro criada está vazia? " + pilha.empty());

            System.out.println("Realiando o empilhamento dos livro na pilha.");

            pilha.push(livro);
            pilha.push(livro1);
            pilha.push(livro2);
            pilha.push(livro3);

            System.out.println( pilha.size() + " livros foram empilhados");
            System.out.println(pilha);

            System.out.println("Pilha de livro criada está vazia? " + pilha.empty());

            System.out.println("Espiando o topo da pilha: " + pilha.peek());

            System.out.println("Desempilhando livros da pilha:  " );

            while (!pilha.empty()){
                System.out.println("Desempilhando livro: " + pilha.pop());
            }

            System.out.println("Todos os livros foram desempilhado, pilha vazia: " +pilha.empty());

        }
}
