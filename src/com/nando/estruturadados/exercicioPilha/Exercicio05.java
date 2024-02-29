package com.nando.estruturadados.exercicioPilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas frases deseja digitar: ");
        int qtd = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < qtd; i++) {
            System.out.print("Insera as " + (i + 1) + " frases :");
            String palindromo = scan.nextLine();

            while (palindromo.isEmpty()){
                System.out.println("Digite algum caracter para ser válido: ");
                palindromo = scan.nextLine();
            }

            imprimeResultado(palindromo);
        }
    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.isEmpty()) {
            palavraInversa += pilha.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }

   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantas frases deseja digitar: ");
        int qtd = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < qtd; i++) {
            System.out.print("Insera as " + (i + 1) + " frases :");
            String palindromo = scan.nextLine();

            testandoPalindromo(palindromo);
        }
    }

    public static void testandoPalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
               String isPalindromo = pilha.empilha(palavra.CharAt(i));

            }
        }

        if (!pilha.estaVazia()) {
            System.out.println("A palavra [ " + palavra + " ] é um palíndromo.");
            System.out.println();
        }
        else {
            System.out.println("A palavra [ " + palavra + " ] não é um palíndromo.");
            System.out.println();
        }
    }*/
}


