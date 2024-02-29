package com.nando.estruturadados.exercicioPilha;

import com.nando.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Entre com um número: ");
            Integer numero = scan.nextInt();

            if (numero == 0) {
                // pilha par
                Integer desempilhado = par.desempilha();
                if (desempilhado == null) {
                    System.out.println("pilha par está vazia");
                } else {
                    System.out.println("Desempilhando da pilha par" + desempilhado);
                }
                // pilha impar
                desempilhado = impar.desempilha();
                if (desempilhado == null) {
                    System.out.println("pilha impar está vazia");
                } else {
                    System.out.println("Desempilhando da pilha impar" + desempilhado);
                }

            } else if (numero % 2 == 0) {
                System.out.println("Empilhando o número [" + numero + "]  na pilha  par ");
                par.empilha(numero);
            } else {
                System.out.println("Empilhandoa o número [" + numero + " ] na pilha impar ");
                impar.empilha(numero);
            }
        }
        System.out.println("Desempilhando todos os número da pilha par ");

        while (!par.estaVazia()) {

            System.out.println("Desempílhando da pilha par"
                    + par.desempilha());
        }

        System.out.println("Desempilhando todos os número da pilha impar ");

        while (!impar.estaVazia()) {

            System.out.println("Desempílhando da pilha impar"
                    + impar.desempilha());
        }
    }
}