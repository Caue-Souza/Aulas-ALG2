package Aula03Correcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    // Carregamento de dados
    Refri cocaCola = new Refri("Coca Cola",0, 10, 2);
    Refri guarana = new Refri("Guaraná", 1,8, 2);
    Refri pepsi = new Refri("Pepsi", 2,7, 2);

    MaquinaRefri maquinaRefri = new MaquinaRefri(0, 0, 0, 0, 0);

    maquinaRefri.adicionarRefri(cocaCola);
    maquinaRefri.adicionarRefri(guarana);
    maquinaRefri.adicionarRefri(pepsi);


    // Atributos menu
    int opcao = -1;
    // Inicia Maquina



    do{
        System.out.println("1 - Comprar refri");
        System.out.println("2 - Listar refrigerantes");
        System.out.println("3 - Mostrar carrinho");
        System.out.println("4 - Pagar a compra");
        System.out.println("10 - Desligar a máquina");

        opcao = scan.nextInt();

        switch(opcao){
            case 1:
                int pointer;

                System.out.println("Essa é lista de refrigerantes disponíveis");
                maquinaRefri.listarRefri();

                System.out.println("Qual refrigerante gostaria de adicionar ao carrinho?");
                pointer = scan.nextInt();
                switch (pointer){
                    case 1: maquinaRefri.adicionarAoCarrrinho(cocaCola);
                    break;
                    case 2:maquinaRefri.adicionarAoCarrrinho(guarana);
                    break;
                    case 3:maquinaRefri.adicionarAoCarrrinho(pepsi);
                    break;
                    default:System.out.println("Digite uma opção válida");
                    break;
                }
            break;
            case 2: maquinaRefri.listarRefri();
            break;
            case 3:System.out.println(maquinaRefri.getCarrinho());
            break;
            case 4:
                System.out.println("Por favor, deposite a quantia de: " + maquinaRefri.getCarrinho() + " R$");
                maquinaRefri.setValorRecebido(scan.nextInt());
                if (maquinaRefri.pagAprovado()){
                    System.out.println("Pagamento efetuado com sucesso!");
                }
            break;
            case 10: scan.close();
            break;
            default:
                System.out.println("Digite um opção válida");
        }
    }while(opcao <= 9);
    }
}
