package Ex_01_Carros;

public class Hyundai extends Carros {

    public Hyundai(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void partidaDoMotor() {
        this.setVelocidade(5);
        super.partidaDoMotor();
    }

    @Override
    public void frear() {
        double velocidadeAtual = this.getVelocidade();
        this.setVelocidade(velocidadeAtual - 2);
        super.frear();
    }

    @Override
    public void acelerar() {
        double velocidadeAtual = this.getVelocidade();
        this.setVelocidade(velocidadeAtual + 15);
        super.acelerar();
    }
}
