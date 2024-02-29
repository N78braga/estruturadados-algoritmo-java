package com.nando.estruturadados.testeFila;

import com.nando.estruturadados.fila.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println("Tem algum elemento na fila: " + fila.estaVazia());
        System.out.println("Quantos elemento tem na fila: " + fila.tamanho());

        System.out.println("Quais são os elementos que estão na fila: " + fila.toString());
    }
}
