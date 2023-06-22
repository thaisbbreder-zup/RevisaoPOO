package Ex_02_Biblioteca;

public class Biblioteca {
    private String isbn;
    private String nomeDoLivro;
    private String genero;
    private String autor;

    //construtores que recebem os parâmetros de acordo com o enunciado do exercício
    public Biblioteca(String isbn, String nomeDoLivro, String genero, String autor) {
        this.isbn = isbn;
        this.nomeDoLivro = nomeDoLivro;
        this.genero = genero;
        this.autor = autor;
    }

    //métodos "registrarLivro" que recebem os parâmetros e imprimem a mensagem de registro
    public void registrarLivro(String isbn) {
        System.out.println("O livro foi registrado com o ISBN " + isbn + "." );
    }

    public void registrarLivro(String isbn, String nomeDoLivro) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" + " foi registrado com o ISBN " + isbn + "." );
    }

    public void registrarLivro(String isbn, String nomeDoLivro, String genero) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" + " foi registrado com o ISBN " + isbn + " e o gênero " + genero + "." );
    }

    public void registrarLivro(String isbn, String nomeDoLivro, String genero, String autor) {
        System.out.println("O livro " + "'" + nomeDoLivro + "'" +" do autor " + autor + " foi registrado com o ISBN " + isbn + " e o gênero " + genero + ".");
    }

    //métodos getter que retornam as informações referentes ao livro
    public String getIsbn() {
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
        System.out.println("Nome: " + nomeDoLivro);
        System.out.println("ISBN: " + isbn);
        System.out.println("Gênero: " + genero);
        System.out.println("Autor: " + autor);
    }
}




