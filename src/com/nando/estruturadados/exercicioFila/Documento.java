package com.nando.estruturadados.exercicioFila;

public class Documento {
    private  String  nome;
    private int  numeroDeFolhas;

    public Documento() {
    }

    public Documento(String nome, int numeroDeFolhas) {
        this.nome = nome;
        this.numeroDeFolhas = numeroDeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeFolhas() {
        return numeroDeFolhas;
    }

    public void setNumeroDeFolhas(int numeroDeFolhas) {
        this.numeroDeFolhas = numeroDeFolhas;
    }
}
