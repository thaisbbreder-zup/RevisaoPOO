package Ex_01_Carros;

public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault("Renault", 2022, 50000.0, "Vermelho", 4);
        Fiat fiat = new Fiat("Fiat", 2021, 40000.0, "Azul", 4);
        Hyundai hyundai = new Hyundai("Hyundai", 2023, 60000.0, "Prata", 4);

        System.out.println("\n--- Carro Renault ---");

        renault.partidaDoMotor();
        renault.acelerar();
        renault.frear();

        System.out.println("\n--- Carro Fiat ---");
        fiat.partidaDoMotor();
        fiat.acelerar();
        fiat.frear();

        System.out.println("\n--- Carro Hyundai ---");
        hyundai.partidaDoMotor();
        hyundai.acelerar();
        hyundai.frear();

    }
}
