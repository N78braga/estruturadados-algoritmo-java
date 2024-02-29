package com.nando.estruturadados.testeFila;

import com.nando.estruturadados.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer>fila = new Fila<>();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println("O primeiro elemnto da fila é o elemento: )" + fila.espiar());

    }
}
