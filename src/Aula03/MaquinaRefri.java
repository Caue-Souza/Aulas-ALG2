package Aula03;

import java.util.Scanner;

public class MaquinaRefri {

    private String marca;
    private double preco;
    private double ml;

     int point = 0;
     int qntd = 0;
     double pag = 0;
     double troco = 0;

    public MaquinaRefri() {

    }
    public void menu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("O que gostaria de fazer? \n"
                        + "1 - Ver a lista de refrigerantes disponíveis para a venda. \n"
                        + "2 - Comprar um refrigerante. \n"
                        + "3 - Desligar a máquina."
                );
        point = scan.nextInt();
        switch (point){
            case 1: verCardapio();
            break;
            case 2: comprarRefri();
            break;
            case 3: encerrarMaq();
            break;
        }

    }
    public void verCardapio(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Temos esses refrigerantes disponíveis para a compra: "
                +"1 - Coca-cola 1L $6,50 \n" +
                "2 - Pepsi 2L $7,50 \n" +
                "3 - Fanta Laranja 1,5L 6,50 \n" +
                "4 - Fanta Uva 1,5L $7,50" );
        menu();
    }
    public void comprarRefri(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual refrigerante você deseja? \n" +
                "1 - Coca-cola 1L $6,50 \n" +
                "2 - Pepsi 2L $7,50 \n" +
                "3 - Fanta Laranja 1,5L 6,50 \n" +
                "4 - Fanta Uva 1,5L $7,50" );
        point = scan.nextInt();

        switch (point){
            case 1: setMarca("Coca-cola"); setMl(1000); setPreco(6.50);
                System.out.println("Quantas unidades você deseja?");
                qntd = scan.nextInt();
                setPreco(preco * qntd);
                System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
                pag = scan.nextDouble();
                if (pag == getPreco()){
                    System.out.println("Agradecemos pela compra!");
                } else if (pag < getPreco()){
                    double media = 0;
                    media = getPreco() - pag;
                    System.out.println("Falta: $" + media +" a ser pago.");
                }else if(pag > getPreco()){
                    double media = 0;
                    media = pag - getPreco();
                    System.out.println("Aqui está seu troco: $" + media);
                }else{
                    System.out.println("Erro, por favor consultar o cara do TI");
                }menu();
                break;

            case 2: setMarca("Pepsi"); setMl(2000); setPreco(7.50);
                    System.out.println("Quantas unidades você deseja?");
                    qntd = scan.nextInt();
                    setPreco(preco * qntd);
                    System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
                    pag = scan.nextDouble();
                    if (pag == getPreco()){
                        System.out.println("Agradecemos pela compra!");
                    } else if (pag < getPreco()){
                        double media = 0;
                        media = getPreco() - pag;
                        System.out.println("Falta: $" + media +" a ser pago.");
                    }else if(pag > getPreco()){
                        double media = 0;
                        media = pag - getPreco();
                        System.out.println("Aqui está seu troco: $" + media);
                    }else{
                        System.out.println("Erro, por favor consultar o cara do TI");
                    }menu();
                    break;

            case 3: setMarca("Fanta Laranja"); setMl(1500); setPreco(6.50);
                System.out.println("Quantas unidades você deseja?");
                qntd = scan.nextInt();
                setPreco(preco * qntd);
                System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
                pag = scan.nextDouble();
                if (pag == getPreco()){
                    System.out.println("Agradecemos pela compra!");
                } else if (pag < getPreco()){
                    double media = 0;
                    media = getPreco() - pag;
                    System.out.println("Falta: $" + media +" a ser pago.");
                }else if(pag > getPreco()){
                    double media = 0;
                    media = pag - getPreco();
                    System.out.println("Aqui está seu troco: $" + media);
                }else{
                    System.out.println("Erro, por favor consultar o cara do TI");
                }menu();
                break;

            case 4: setMarca("Fanta Uva"); setMl(1500); setPreco(7.50);
                System.out.println("Quantas unidades você deseja?");
                qntd = scan.nextInt();
                setPreco(preco * qntd);
                System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
                pag = scan.nextDouble();
                if (pag == getPreco()){
                    System.out.println("Agradecemos pela compra!");
                } else if (pag < getPreco()){
                    double media = 0;
                    media = getPreco() - pag;
                    System.out.println("Falta: $" + media +" a ser pago.");
                }else if(pag > getPreco()){
                    double media = 0;
                    media = pag - getPreco();
                    System.out.println("Aqui está seu troco: $" + media);
                }else{
                    System.out.println("Erro, por favor consultar o cara do TI");
                }menu();
                break;
        }
    }
    public void encerrarMaq(){
        System.out.println("Muito obrigado por usar o programa!");

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMl() {
        return ml;
    }

    public void setMl(double ml) {
        this.ml = ml;
    }
}
