package com.nando.estruturadados.exercicioPilha;

import java.util.Stack;

public class Exercicio07 {
    public static void main(String[] args) {
        imprimeResultado(10);

        imprimeResultado(25);

        imprimeResultado(10035);

        imprimeResultadoQualquerBase(25, 16);

        imprimeResultadoQualquerBase(10035, 8);

        imprimeResultadoQualquerBase(10035, 16);

    }
    public static void imprimeResultado(int numero){
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase(int numero, int base){
        System.out.println(numero + " na base " + base +
                " é: " +  baseQualquerDecimal(numero, base));
    }

    public static String decimalBinario(int numero) {
        Stack<Integer> pilha = new Stack<>();
        String numeroBinario = "";
        int resto;
        while (numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }
        while (!pilha.isEmpty()) {
            numeroBinario += pilha.pop();
        }
        return numeroBinario;
    }

    public static String baseQualquerDecimal(int numero, int base) {
        if (base > 16) {
            throw new IllegalArgumentException();
        }
        Stack<Integer> pilha = new Stack<>();
        String numeroBase = "";
        int resto;
        String baseBinaria = "0123456789ABCDEF";
        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }
        while (!pilha.isEmpty()) {
            numeroBase += baseBinaria.charAt(pilha.pop());
        }
        return numeroBase;
    }
}
