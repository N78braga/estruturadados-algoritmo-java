package com.nando.estruturadados.testePilha;

import com.nando.estruturadados.pilha.Pilha;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty()); // verifica se esta vazia
        System.out.println(stack.size()); // verifica o tamanho da pilha
        System.out.println(stack); // chamar o toString da pilha
        System.out.println(stack.peek()); // método para espiar a pilha
        System.out.println(stack.pop()); //  remove o elemento da pilha
        System.out.println(stack);

    }

}
