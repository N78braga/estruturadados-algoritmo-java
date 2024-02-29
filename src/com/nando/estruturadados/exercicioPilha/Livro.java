package com.nando.estruturadados.exercicioPilha;

public class Livro {

    private String isbn;
    private String autor;
    private  int anolLancamento;
    private String nome;

    public Livro() {
        super();
    }


    public Livro(String isbn, String autor, int anolLancamento, String nome) {
        this.isbn = isbn;
        this.autor = autor;
        this.anolLancamento = anolLancamento;
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnolLancamento() {
        return anolLancamento;
    }

    public void setAnolLancamento(int anolLancamento) {
        this.anolLancamento = anolLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", anolLancamento='" + anolLancamento + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
