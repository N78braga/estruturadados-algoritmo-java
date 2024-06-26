package com.nando.estruturadados.exercicioFila;

import com.nando.estruturadados.fila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable {

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    Random  prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {

        for (int i=0; i<8; i++) {
            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("" + cont,  prioridade.nextInt(3));
                fila.enfileirar(p);
                cont++;
                System.out.println(p + " Novo atendimento");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
