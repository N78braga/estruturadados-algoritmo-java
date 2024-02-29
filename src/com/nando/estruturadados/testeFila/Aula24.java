package com.nando.estruturadados.testeFila;

import com.nando.estruturadados.fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(2);
        System.out.println(fila);
    }
}
