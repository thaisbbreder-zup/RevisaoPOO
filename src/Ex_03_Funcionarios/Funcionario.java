package Ex_03_Funcionarios;
import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private int identificador;
    private static int contadorIdentificador = 1;

    public Funcionario() {
        this.identificador = contadorIdentificador++;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        LocalDate dataAtual = LocalDate.now();
        if (dataAdmissao.isAfter(dataAtual)) {
            System.out.println("\n*Erro na data informada: " + dataAdmissao + "* \nA data de admissão não pode ser no futuro.");
        } else {
            this.dataAdmissao = dataAdmissao;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 700) {
            this.salario = 0.0;
            System.out.println("\n*Erro no salário informado: R$" + salario + "* \nNão é permitido cadastrar salário inferior a R$700 reais.");
        } else {
            this.salario = salario;
        }
    }
}
