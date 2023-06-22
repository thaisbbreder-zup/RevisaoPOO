package Ex_01_Carros;

public class Fiat extends Carros {

    public Fiat(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void partidaDoMotor() {
        this.setVelocidade(3);
        super.partidaDoMotor();
    }

    @Override
    public void frear() {
        double velocidadeAtual = this.getVelocidade();
        this.setVelocidade(velocidadeAtual - 6);
        super.frear();
    }

    @Override
    public void acelerar() {
        double velocidadeAtual = this.getVelocidade();
        this.setVelocidade(velocidadeAtual + 12);
        super.acelerar();
    }
}
