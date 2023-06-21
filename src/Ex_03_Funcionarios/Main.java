package Ex_03_Funcionarios;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        System.out.println("\n----------------------| Lista de Funcionários |----------------------");

        funcionario1.setNome("Rick Santos");
        funcionario1.setDataAdmissao(LocalDate.of(2021, 3, 16));
        funcionario1.setSalario(8500.00);

        System.out.println("\nIdentificador: " + funcionario1.getIdentificador()
                + "\nNome: " + funcionario1.getNome()
                + "\nData de Admissão: " + funcionario1.getDataAdmissao()
                + "\nSalário: " + funcionario1.getSalario());

        System.out.println("\n----------------------------------------------------------------------");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Gui Januario");
        funcionario2.setDataAdmissao(LocalDate.of(2022, 9, 25));
        funcionario2.setSalario(7500.00);

        System.out.println("\nIdentificador: " + funcionario2.getIdentificador()
                + "\nNome: " + funcionario2.getNome()
                + "\nData de Admissão: " + funcionario2.getDataAdmissao()
                + "\nSalário: " + funcionario2.getSalario());

        System.out.println("\n----------------------------------------------------------------------");
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Meire Lopes");
        funcionario3.setDataAdmissao(LocalDate.of(2023, 2, 5));
        funcionario3.setSalario(6500.00);

        System.out.println("\nIdentificador: " + funcionario3.getIdentificador()
                + "\nNome: " + funcionario3.getNome()
                + "\nData de Admissão: " + funcionario3.getDataAdmissao()
                + "\nSalário: " + funcionario3.getSalario());

        System.out.println("\n----------------------------------------------------------------------");
        Funcionario funcionario4 = new Funcionario();
        funcionario4.setNome("João Cruz");
        funcionario4.setDataAdmissao(LocalDate.of(2024, 1, 1));
        funcionario4.setSalario(500.00);

        System.out.println("\nIdentificador: " + funcionario4.getIdentificador()
                + "\nNome: " + funcionario4.getNome()
                + "\nData de Admissão: " + funcionario4.getDataAdmissao()
                + "\nSalário: " + funcionario4.getSalario());
    }
}
