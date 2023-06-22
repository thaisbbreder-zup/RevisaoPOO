package Ex_02_Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca livro1 = new Biblioteca("9789896661458", "Rita Lee: uma autobiografia", "Autobiografia", "Rita Lee");
        Biblioteca livro2 = new Biblioteca("9780857533937", "O Menino do Pijama Listrado", "Ficção", " ");
        Biblioteca livro3 = new Biblioteca("9788869183157", "Harry Potter e a Pedra Filosofal", " ", " ");
        Biblioteca livro4 = new Biblioteca("9788869183157",  " ", " ", " ");

        System.out.println();
        System.out.println("***************************** REGISTRO DE LIVROS NA BIBLIOTECA *****************************");
        System.out.println();

        System.out.println("\n| Livro 1 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        livro1.exibirInformacoes();
        livro1.registrarLivro(livro1.getIsbn(), livro1.getNomeDoLivro(), livro1.getGenero(), livro1.getAutor());
        System.out.println();

        System.out.println("\n| Livro 2 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        livro2.exibirInformacoes();
        livro2.registrarLivro(livro2.getIsbn(), livro2.getNomeDoLivro(), livro2.getGenero());
        System.out.println();

        System.out.println("\n| Livro 3 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        livro3.exibirInformacoes();
        livro3.registrarLivro(livro3.getIsbn(), livro3.getNomeDoLivro());
        System.out.println();

        System.out.println("\n| Livro 4 |");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        livro4.exibirInformacoes();
        livro4.registrarLivro(livro4.getIsbn());
    }
}