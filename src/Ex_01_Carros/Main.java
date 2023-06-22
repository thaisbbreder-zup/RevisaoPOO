package Ex_01_Carros;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault("Renault", 2022, 50000.0, "Vermelho", 4);
        Fiat fiat = new Fiat("Fiat", 2021, 40000.0, "Azul", 4);
        Hyundai hyundai = new Hyundai("Hyundai", 2023, 60000.0, "Prata", 4);

        Scanner entradaDoUsuario = new Scanner(System.in);
        int opcaoAcao = 0;
        int opcaoCarro;

        do {
            System.out.println("\n------------------ ICarros: Sistema de Registro e Teste ------------------");

            System.out.println("\nEscolha um carro para testar: \n1 - Renault \n2 - Fiat \n3 - Hyundai \n4 - Finalizar\n");
            opcaoCarro = entradaDoUsuario.nextInt();
            if (opcaoCarro == 1) {
                System.out.println("\n--- Carro Renault ---");
                renault.exibirInformacoes();

            } else if (opcaoCarro == 2) {
                System.out.println("\n--- Carro Fiat ---");
                fiat.exibirInformacoes();

            } else if (opcaoCarro == 3) {
                System.out.println("\n--- Carro Hyundai ---");
                hyundai.exibirInformacoes();
            }

            if (opcaoCarro >= 1 && opcaoCarro <= 3) {
                do {
                    System.out.println("\nDigite a ação desejada:");
                    System.out.println("1 - Dar partida");
                    System.out.println("2 - Acelerar");
                    System.out.println("3 - Frear");
                    System.out.println("4 - Voltar para a escolha de carros");

                    opcaoAcao = entradaDoUsuario.nextInt();

                    if (opcaoAcao == 1) {
                        if (opcaoCarro == 1) {
                            renault.partidaDoMotor();
                        } else if (opcaoCarro == 2) {
                            fiat.partidaDoMotor();
                        } else {
                            hyundai.partidaDoMotor();
                        }
                    } else if (opcaoAcao == 2) {
                        if (opcaoCarro == 1) {
                            renault.acelerar();
                        } else if (opcaoCarro == 2) {
                            fiat.acelerar();
                        } else {
                            hyundai.acelerar();
                        }
                    } else if (opcaoAcao == 3) {
                        if (opcaoCarro == 1) {
                            renault.frear();
                        } else if (opcaoCarro == 2) {
                            fiat.frear();
                        } else {
                            hyundai.frear();
                        }
                    }
                } while (opcaoAcao != 4);
            }
        } while (opcaoCarro != 4);
    }
}
