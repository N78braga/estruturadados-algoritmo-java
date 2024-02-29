package com.nando.estruturadados.exercicioPilha;

import java.util.Stack;

public class Exercicio08 {
    public static void main(String[] args) {
        Stack<Integer>original = new Stack<>();
        Stack<Integer>destino = new Stack<>();
        Stack<Integer>auxiliar = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);
        torreHanoi(original.size(),original,destino,auxiliar);

    }
    public static void torreHanoi(int movimentoDisco , Stack<Integer> original,
                                  Stack<Integer>destino, Stack<Integer>auxiliar){

        if (movimentoDisco > 0){
            torreHanoi(movimentoDisco-1, original, auxiliar,destino);
            destino.push(original.pop());
            System.out.println("-------------------------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreHanoi(movimentoDisco -1,auxiliar,destino,original);

        }

    }
}
