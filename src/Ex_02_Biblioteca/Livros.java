package Ex_02_Biblioteca;

public class Livros {
    private int isbn;
    private String nomeDoLivro;
    private String genero;
    private String autor;

    //construtores que recebem os parâmetros de acordo com o enunciado do exercício
    public Livros(int isbn, String nomeDoLivro, String genero, String autor) {
        this.isbn = isbn;
        this.nomeDoLivro = nomeDoLivro;
        this.genero = genero;
        this.autor = autor;
    }

    //métodos "registrarLivro" que recebem os parâmetros e imprimem a mensagem de registro
    public void registrarLivro(int isbn) {
        System.out.println("O livro foi registrado com o ISBN " + isbn + "." );
    }

    public void registrarLivro(int isbn, String nomeDoLivro) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" + " foi registrado com o ISBN " + isbn + "." );
    }

    public void registrarLivro(int isbn, String nomeDoLivro, String genero) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" + " foi registrado com o ISBN " + isbn + " e o gênero " + genero + "." );
    }

    public void registrarLivro(int isbn, String nomeDoLivro, String genero, String autor) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" +" do autor " + autor + " foi registrado com o ISBN " + isbn + " e o gênero " + genero + ".");
    }

    //metodos getter que retornam as informações referentes ao livro
    public int getIsbn() {
        return isbn;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirInformacoes() {
        System.out.println("Livro: " + nomeDoLivro);
        System.out.println("ISBN: " + isbn);
        System.out.println("Gênero: " + genero);
        System.out.println("Autor: " + autor);
    }
}




