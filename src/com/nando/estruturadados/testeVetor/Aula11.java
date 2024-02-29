package com.nando.estruturadados.testeVetor;

import com.nando.estruturadados.vetor.Lista;

public class Aula11 {
    public static void main(String[] args) {
       /* Lista<String> vetor = new Lista<>(1);
        vetor.adiciona("Elemento");

        System.out.println(vetor);*/

        Lista<Contato> vetor = new Lista<>(1);
        Contato contato1 = new Contato("Contato 1", "1234-4567", "contato1@gmail.com");
        Contato contato2 = new Contato("Contato 2", "4567-1234", "contato2@gmail.com");
        Contato contato3 = new Contato("Contato 3", "4567-7891", "contato3@gmail.com");

        vetor.adiciona(contato1);
        vetor.adiciona(contato2);




        System.out.println(vetor);


        System.out.println(vetor.conten(contato2));





    }
}
