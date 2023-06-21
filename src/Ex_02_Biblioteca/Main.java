package Ex_02_Biblioteca;

public class Main {
    public static void main(String[] args) {
        //inicialização de um objeto
        Livros livro1 = new Livros(1234, "Rita Lee: uma autobiografia", "Autobiografia", "Rita Lee");
        Livros livro2 = new Livros(5678, "O Menino do Pijama Listrado", "Ficção");
        Livros livro3 = new Livros(9012, "Harry Potter e a Pedra Filosofal");
        Livros livro4 = new Livros(3461);

        System.out.println(" ");
        System.out.println("--------------------- REGISTRO DE LIVROS EM ESTOQUE ---------------------");
        System.out.println(" ");

        System.out.println("Livro 1: ");
        livro1.registrarLivro(livro1.getIsbn(), livro1.getNomeDoLivro(), livro1.getGenero(), livro1.getAutor());
        System.out.println(" ");

        System.out.println("Livro 2: ");
        livro2.registrarLivro(livro2.getIsbn(), livro2.getNomeDoLivro(), livro2.getGenero());
        System.out.println(" ");

        System.out.println("Livro 3: ");
        livro3.registrarLivro(livro3.getIsbn(), livro3.getNomeDoLivro());
        System.out.println(" ");

        System.out.println("Livro 4: ");
        livro4.registrarLivro(livro4.getIsbn());
    }
}
