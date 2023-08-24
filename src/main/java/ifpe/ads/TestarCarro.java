package ifpe.ads;

import java.util.Scanner;

public class TestarCarro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Carro carro;
        double combustivel;
        double eficiencia;
        double km;
        double litros;


        System.out.println("-------------------------------");
        System.out.println("Quantos Km por litro de gasolina seu carro faz? ");
        eficiencia = ler.nextDouble();
        System.out.println("-------------------------------");

        System.out.println("-------------------------------");
        System.out.println("Quantos litros você vai abastecer? ");
        combustivel = ler.nextDouble();
        System.out.println("-------------------------------");

        carro = new Carro(combustivel, eficiencia);

        int opcao = 4;
        while (opcao != 0) {
            menu();
            System.out.print("Opção: ");
            opcao = ler.nextInt();
            System.out.println("-------------------------------");

            switch (opcao) {
                case 1 -> {
                    System.out.println("Quantos Km deseja andar? ");
                    km = ler.nextDouble();

                    System.out.println("-------------------------------");
                    System.out.println(carro.andar(km));
                    System.out.println("-------------------------------");
                }
                case 2 -> {
                    System.out.println("Quantos litros deseja abastecer? ");
                    litros = ler.nextDouble();
                    carro.abastecer(litros);

                    System.out.println("-------------------------------");
                    System.out.println("Carro abastecido!");
                    System.out.println("-------------------------------");
                }
                case 3 -> {
                    System.out.println("-------------------------------");
                    System.out.printf("Seu carro ainda tem %f litros de gasolina. \n", carro.getCombustivel());
                    System.out.println("-------------------------------");
                }
                case 0 -> {
                    System.out.println("-------------------------------");
                    System.out.println("Viagem encerrada!");
                    System.out.println("-------------------------------");
                }
                default -> {
                    System.out.println("-------------------------------");
                    System.out.println("Essa opção não existe!");
                    System.out.println("-------------------------------");
                }
            }
        }
    }

    public static void menu() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("-------------------------------");
        System.out.println("[1] Andar");
        System.out.println("[2] Reabastecer");
        System.out.println("[3] Verificar a quantidade de combustível restante");
        System.out.println("[0] Encerrar a viagem");
        System.out.println("-------------------------------");
    }
}
