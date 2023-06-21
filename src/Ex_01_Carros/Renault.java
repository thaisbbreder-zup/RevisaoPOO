package Ex_01_Carros;


public class Renault extends Carros{

    public Renault(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void partidaDoMotor() {
        this.setVelocidade(0);
        super.partidaDoMotor();
    }

    @Override
    public void frear() {
        double velocidadeAtual = this.getVelocidade();
        this.setVelocidade(velocidadeAtual - 5);
        super.frear();
    }

    @Override
    public void acelerar() {
        double velocidadeAtual = this.getVelocidade();
        this.setVelocidade(velocidadeAtual + 10);
        super.acelerar();
    }
}
