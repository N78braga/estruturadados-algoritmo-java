package exercicioFila;

import com.nando.estruturadados.fila.Fila;

public class Exercicio01 {
    public static void main(String[] args) {

        Fila<Documento> imprissora = new Fila<>();

        imprissora.enfileirar(new Documento("Arquivo 1", 1));
        imprissora.enfileirar(new Documento("Arquivo 2", 2));
        imprissora.enfileirar(new Documento("Arquivo 3", 3));
        imprissora.enfileirar(new Documento("Arquivo 4", 7));
        imprissora.enfileirar(new Documento("Arquivo 5", 9));

        while (!imprissora.estaVazia()){
            Documento documento = imprissora.desenfileirar();
            System.out.println("Imprimindo documento ".concat(documento.getNome()));

            try{
                Thread.sleep(200 * documento.getNumeroDeFolhas());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Todo os documentos foram impressos.");





    }
}
