package com.nando.estruturadados.exercicioVetor;

import com.nando.estruturadados.vetor.Lista;

public class Exercicio03 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(3);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");

        System.out.println(vetor);

        vetor.remova("A");
        System.out.println(vetor);




    }
}
