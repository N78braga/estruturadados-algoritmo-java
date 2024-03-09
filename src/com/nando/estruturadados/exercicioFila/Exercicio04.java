package com.nando.estruturadados.exercicioFila;

import com.nando.estruturadados.fila.Fila;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) throws InterruptedException {
        Fila<Integer> fila = new Fila<>();
        for (int i = 0; i < 8; i++){
            fila.enfileirar(i);
        }

        Random aleatorio = new Random();
        int num = 0;
        while(num == 0){
            num = aleatorio.nextInt(10);
        }
        System.out.println("Número = " + num);

        while ((fila.tamanho()>1)){
            comecoDoJogo();
            for(int i=0; i<num; i++){

                fila.enfileirar(fila.desenfileirar());
            }
            System.out.println("Eliminado  = " +  fila.desenfileirar());
        }
        System.out.println("Ganhador = " + fila.desenfileirar());
    }
    public  static  void comecoDoJogo() throws InterruptedException {
        System.out.println("Ba");
        Thread .sleep(1000);
        System.out.println("ta");
        Thread .sleep(1000);
        System.out.println("ta");
        Thread .sleep(1000);
        System.out.println("quente!!!");
        Thread .sleep(800);
        System.out.println("quente!!!");
        Thread .sleep(800);
        System.out.println("quente!!!");
        Thread .sleep(800);
        System.out.println("quente!!!");
    }
}
