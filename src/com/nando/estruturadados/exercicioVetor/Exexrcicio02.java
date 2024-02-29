package com.nando.estruturadados.exercicioVetor;

import com.nando.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exexrcicio02 {
    public static void main(String[] args) {

        ArrayList<String> vetor = new ArrayList<>(5);
        vetor.add("A");
        vetor.add("B");
        vetor.add("A");

        System.out.println(vetor.lastIndexOf("A"));

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));
    }






}
