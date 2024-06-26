package com.nando.estruturadados.testeFila;

import com.nando.estruturadados.fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileirar(new Paciente("A", 2));
        fila.enfileirar(new Paciente("C", 1));
        fila.enfileirar(new Paciente("B", 3));
        System.out.println(fila);

        System.out.println("Paciente retirado da fila " + fila.desenfileirar());

        System.out.println(fila);
    }
}
