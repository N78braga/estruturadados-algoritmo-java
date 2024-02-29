package com.nando.estruturadados.exercicioPilha;

import com.nando.estruturadados.pilha.Pilha;

public class Exercicio06 {
    public static void main(String[] args) {
        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{[(]}[](){()}");
        imprimeResultado("A + B + C - D)");


    }

    public static void imprimeResultado(String expressao) {
        if (verificaSimbolosBalanceado(expressao) ==  true){
            System.out.println(expressao + " -> está balanceada? " );
        }else {
            System.out.println(expressao + " -> não está balanceada? " );
        }

    }

    final static String CARACTERABERTURA = "([{";
    final static String CARACTERFECHADO = ")]}";

    public static boolean verificaSimbolosBalanceado(String expressao) {

        boolean balanceada = true;

        Pilha<Character> pilha = new Pilha<>();
        char simbolo, topo;

        for (int i = 0; i < expressao.length(); i++) {
            simbolo = expressao.charAt(i);

            if (CARACTERABERTURA.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (CARACTERFECHADO.indexOf(simbolo) > -1) {
                if (pilha.estaVazia()) {
                    return false;
                } else {
                    topo = pilha.desempilha();

                    if (CARACTERABERTURA.indexOf(topo) != CARACTERFECHADO.indexOf(simbolo)) {
                        return false;
                    }

                }

            }

        }

        return true;
    }
}
