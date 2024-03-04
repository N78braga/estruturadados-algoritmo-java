package com.nando.estruturadados.exercicioFila;

import com.nando.estruturadados.fila.Fila;

public class Exercicio02 {
    public static void main(String[] args) {
        Fila<String> filaregular = new Fila<>();
        Fila<String> filaPrioridade = new Fila<>();

        final int MAXIMO_PRIORIDADE = 3 ;

        filaregular.enfileirar("Pessoa 1");
        filaregular.enfileirar("Pessoa 2");
        filaregular.enfileirar("Pessoa 3");
        filaPrioridade.enfileirar("Pessoa 1P");
        filaPrioridade.enfileirar("Pessoa 2P");
        filaPrioridade.enfileirar("Pessoa 3P");
        filaPrioridade.enfileirar("Pessoa 4P");
        filaPrioridade.enfileirar("Pessoa 5P");
        filaregular.enfileirar("Pessoa 4");
        filaregular.enfileirar("Pessoa 5");
        filaregular.enfileirar("Pessoa 6");
        filaregular.enfileirar("Pessoa 7");
        filaregular.enfileirar("Pessoa 8");

        while (!filaregular.estaVazia() || !filaPrioridade.estaVazia()) {

            int count = 0;

            while (!filaPrioridade.estaVazia() &&  count < MAXIMO_PRIORIDADE){
                atendePessoa(filaPrioridade);
                count ++;
            }
            if(!filaregular.estaVazia()){
               atendePessoa(filaregular);
            }
            if (filaPrioridade.estaVazia()){
                while (!filaregular.estaVazia()){
                    atendePessoa(filaregular);
                }
            }
        }
    }
    public static void atendePessoa(Fila<String> fila){
        String pessoaAtendida = fila.desenfileirar();
        System.out.println(pessoaAtendida.concat(" foi atendida."));
    }
}
