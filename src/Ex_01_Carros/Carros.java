package Ex_01_Carros;


public abstract class Carros { // Classe base. Não é possível criar objetos dessa classe específica
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private double velocidade;

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public String getCor() {
        return cor;
    }

    public int getPortas() {
        return portas;
    }

    public Carros(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = 0;
    }

    public void partidaDoMotor() {
        System.out.println("-------------- Iniciando o motor... minha velocidade está em " + getVelocidade() + " km/h");
    }

    public void frear() {
        if(velocidade <= 0){
            velocidade = 0;
            System.out.println("----------------------------------------------------------------- Agora estou parado.");
    }else {
            System.out.println("------------------- Freando... minha velocidade está em " + getVelocidade() + " km/h.");
        }
        }

    public void acelerar() {
        System.out.println("--------------------- Acelerando... minha velocidade está em " + getVelocidade() + " km/h");
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void exibirInformacoes( ) {

        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor );
        System.out.println("Marca: " + marca );
        System.out.println("Valor: " + valor );
        System.out.println("Portas: " + portas );
    }
}
