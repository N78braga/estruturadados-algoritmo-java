package com.nando.estruturadados.testeVetor;

import com.nando.estruturadados.vetor.VetorObjects;

public class Aula10 {
    public static void main(String[] args) {

       VetorObjects vetor = new VetorObjects(3);
        /* vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);*/ // Teste realizado com a class VetorObjcts

        Contato contato1 = new Contato("Contato 1", "1234-4567", "contato1@gmail.com");
        Contato contato2 = new Contato("Contato 2", "4567-1234", "contato2@gmail.com");
        Contato contato3 = new Contato("Contato 3", "4567-7891", "contato3@gmail.com");

        Contato contato4 = new Contato("Contato 1", "1234-4567", "contato1@gmail.com");

        vetor.adiciona(contato1);
        vetor.adiciona(contato2);
        vetor.adiciona(contato3);


        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(contato4);
        if (pos > -1){
            System.out.println("Elemento existe no vetor");
        }else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);




    }
}
