package Aula03;

import java.util.Scanner;

public class MaqAntiga {

    private String marca;
    private double preco;
    private double ml;


    public MaqAntiga() {
        // Scanner scan = new Scanner(System.in);
        // String resposta;
        // System.out.println("Olá, gostaria de comprar um refrigerante? " + " Sim ou Não ? ");
        // resposta = scan.nextLine();

        // if(resposta.startsWith("s")){
        //     int point = 0;
        //     int qntd = 0;
        //     double pag = 0;
        //     double troco = 0;

        //     System.out.println("Ótimo, qual refrigerante você gostaria?");
        //     System.out.println(
        //             "1 - Coca-cola 1L $6,50 \n" +
        //             "2 - Pepsi 2L $7,50 \n" +
        //             "3 - Fanta Laranja 1,5L 6,50 \n" +
        //             "4 - Fanta Uva 1,5L $7,50" );
        //     point = scan.nextInt();
        //     if (point == 1){
        //         setMarca("Coca-cola"); setMl(1000); setPreco(6.50);
        //         System.out.println("Quantas unidades você deseja?");
        //         qntd = scan.nextInt();
        //         setPreco(preco * qntd);
        //         System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
        //         pag = scan.nextDouble();
        //         if (pag == getPreco()){
        //             System.out.println("Agradecemos pela compra!");
        //         } else if (pag < getPreco()){
        //             double media = 0;
        //             media = getPreco() - pag;
        //             System.out.println("Falta: $" + media +" a ser pago.");
        //         }else if(pag > getPreco()){
        //             double media = 0;
        //             media = pag - getPreco();
        //             System.out.println("Aqui está seu troco: $" + media);
        //         }else{
        //             System.out.println("Erro, por favor consultar o cara do TI");
        //         }

        //     } else if (point == 2){
        //         setMarca("Pepsi"); setMl(2000); setPreco(7.50);
        //         System.out.println("Quantas unidades você deseja?");
        //         qntd = scan.nextInt();
        //         setPreco(preco * qntd);
        //         System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
        //         pag = scan.nextDouble();
        //         if (pag == getPreco()){
        //             System.out.println("Agradecemos pela compra!");
        //         } else if (pag < getPreco()){
        //             double media = 0;
        //             media = getPreco() - pag;
        //             System.out.println("Falta: $" + media +" a ser pago.");
        //         }else if(pag > getPreco()){
        //             double media = 0;
        //             media = pag - getPreco();
        //             System.out.println("Aqui está seu troco: $" + media);
        //         }else{
        //             System.out.println("Erro, por favor consultar o cara do TI");
        //         }

        //     }else if (point == 3){
        //         setMarca("Fanta Laranja"); setMl(1500); setPreco(6.50);
        //         System.out.println("Quantas unidades você deseja?");
        //         qntd = scan.nextInt();
        //         setPreco(preco * qntd);
        //         System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
        //         pag = scan.nextDouble();
        //         if (pag == getPreco()){
        //             System.out.println("Agradecemos pela compra!");
        //         } else if (pag < getPreco()){
        //             double media = 0;
        //             media = getPreco() - pag;
        //             System.out.println("Falta: $" + media +" a ser pago.");
        //         }else if(pag > getPreco()){
        //             double media = 0;
        //             media = pag - getPreco();
        //             System.out.println("Aqui está seu troco: $" + media);
        //         }else{
        //             System.out.println("Erro, por favor consultar o cara do TI");
        //         }

        //     }else if (point == 4){
        //         setMarca("Fanta Uva"); setMl(1500); setPreco(7.50);
        //         System.out.println("Quantas unidades você deseja?");
        //         qntd = scan.nextInt();
        //         setPreco(preco * qntd);
        //         System.out.println("Pronto, o valor a ser pago é: " + getPreco() + "\nPor favor, insira o dinheiro.");
        //         pag = scan.nextDouble();
        //         if (pag == getPreco()){
        //             System.out.println("Agradecemos pela compra!");
        //         } else if (pag < getPreco()){
        //             double media = 0;
        //             media = getPreco() - pag;
        //             System.out.println("Falta: $" + media +" a ser pago.");
        //         }else if(pag > getPreco()){
        //             double media = 0;
        //             media = pag - getPreco();
        //             System.out.println("Aqui está seu troco: $" + media);
        //         }else{
        //             System.out.println("Erro, por favor consultar o cara do TI");
        //         }
        //     }

        // }else if(resposta.startsWith("n")){
        //     System.out.println("Muito obrigado, até mais tarde!");
        // }else{
        //     System.out.println("Por favor, selecione uma opção válida.");
        // }
        // scan.close();
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
