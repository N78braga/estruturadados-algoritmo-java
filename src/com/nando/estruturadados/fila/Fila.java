package com.nando.estruturadados.fila;

import com.nando.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        this.adiciona(elemento);

    }

    public T espiar() {

        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POSICAO = 0;

        if (this.estaVazia()) {
            return null;
        }
        T elementoAserRemovido = this.elementos[POSICAO];
        this.remove(POSICAO);
        return elementoAserRemovido;

    }


}
