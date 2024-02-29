package com.nando.estruturadados.testeVetor;

import com.nando.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);

        System.out.println("Remover o elemento ");

        int posicao = vetor.busca("E");

        if (posicao > -1) {
            vetor.remove(posicao);
        } else {
            System.out.println("Elemento não existe no vetor ");
        }
        System.out.println(vetor);


    }
}
