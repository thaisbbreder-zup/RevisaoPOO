package Ex_02_Biblioteca;

public class Main {
    public static void main(String[] args) {
        Livros livro1 = new Livros(1234, "Rita Lee: uma autobiografia", "Autobiografia", "Rita Lee");
        Livros livro2 = new Livros(5678, "O Menino do Pijama Listrado", "Ficção", null);
        Livros livro3 = new Livros(9012, "Harry Potter e a Pedra Filosofal", null, null);
        Livros livro4 = new Livros(3461, null, null, null);

        System.out.println();
        System.out.println("***************************** REGISTRO DE LIVROS NA BIBLIOTECA *****************************");
        System.out.println();

        System.out.println("| Livro 1 |");
        System.out.println("--------------");
        livro1.exibirInformacoes();
        livro1.registrarLivro(livro1.getIsbn(), livro1.getNomeDoLivro(), livro1.getGenero(), livro1.getAutor());
        System.out.println();

        System.out.println("| Livro 2 |");
        System.out.println("--------------");
        livro2.exibirInformacoes();
        livro2.registrarLivro(livro2.getIsbn(), livro2.getNomeDoLivro(), livro2.getGenero());
        System.out.println();

        System.out.println("| Livro 3 |");
        System.out.println("--------------");
        livro3.exibirInformacoes();
        livro3.registrarLivro(livro3.getIsbn(), livro3.getNomeDoLivro());
        System.out.println();

        System.out.println("| Livro 4 |");
        System.out.println("--------------");
        livro4.exibirInformacoes();
        livro4.registrarLivro(livro4.getIsbn());
    }
}