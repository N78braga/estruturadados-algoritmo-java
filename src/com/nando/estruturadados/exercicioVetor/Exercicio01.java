package com.nando.estruturadados.exercicioVetor;

import com.nando.estruturadados.vetor.Lista;

public class Exercicio01 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor.conten("A"));
        System.out.println(vetor.conten("B"));
        System.out.println(vetor.conten("E"));


    }
}
