package com.nando.estruturadados.exercicioPilha;

import com.nando.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            System.out.print("Entre com um número: ");
            Integer numero = scan.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Empilhando o número " + numero);
                pilha.empilha(numero);
            } else {
                Integer desempilhado = pilha.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");

                } else {
                    System.out.println("Número impar, desempilhando um elemento da pilha: "
                            + desempilhado);
                }
            }


        }
        System.out.println("todos os número foram lidos, desempilhando número da pillha ");

        while (!pilha.estaVazia()) {

            System.out.println("Número impar, desempilhando um elemento da pilha: "
                    + pilha.desempilha());
        }
        System.out.println("todos os elementos foram desempilhado");

    }
}

