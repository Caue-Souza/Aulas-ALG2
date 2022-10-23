package Aula03Correcao;

import java.util.ArrayList;
import java.util.List;

// Faça a abstração das informações de uma máquina de refrigerante e implemente em Java.

// ● Modele a classe MaquinaRefrigerante (e outras, caso existam) em UML;

// ● Construa um programa em Java que simule a execução de uma máquina de refrigerante;

// ● A máquina de refrigerante deve, por exemplo:

//   o realizar uma venda;

//   o selecionar um refrigerante;

//   o inserir o dinheiro;

//   o devolver o troco.

// ● Aplique a técnica de encapsulamento em seus modificadores de acesso;

// ● Utilize construtores (Default não vale);

// ● Implemente também os métodos get e set;

// ● O programa deve ter um menu de navegação.

public class MaquinaRefri {

    private int estoque = 0;
    private int saldoMaquina = 0;

    private int valorRecebido = 0;
    private int troco = 0;
    private int carrinho = 0;
    private boolean pagAprov = true;

    List<Refri> sabores = new ArrayList<>();


    public MaquinaRefri(int estoque, int saldoMaquina, int valorRecebido, int troco, int carrinho) {
        this.estoque = estoque;
        this.saldoMaquina = saldoMaquina;
//        this.valorRecebido = valorRecebido;
        this.troco = troco;
        this.carrinho = carrinho;
    }

    
    public void adicionarRefri(Refri refri){
        //Lista de refri
        sabores.add(refri);
    }

    public void listarRefri(){
        
        for (int i = 0; i < sabores.size(); i++) {

            sabores.get(i).id ++;

            System.out.println(sabores.get(i).id +  " - " + sabores.get(i).nome);
        }

        for (Refri refri : sabores) {
            refri.getNome();
        }
    }
    public void adicionarAoCarrrinho(Refri refri){
        setCarrinho(getCarrinho() + refri.getValor());
    }
    public void retornaTroco(){
        setTroco(valorRecebido - carrinho);
        System.out.println("Troco de: " + getTroco() +" R$");
    }
    public boolean  pagAprovado() {
        if (valorRecebido == carrinho){
            setPagAprov(true);
        }else if (valorRecebido < carrinho){
            setPagAprov(false);
        }else if (valorRecebido > carrinho){
            retornaTroco();
        }
        return pagAprov;
    }
//    public void pagarCompra(){
//        pagAprovado();
//
//    }
//    public void mostrarCarrrinho(){
////        for (int i = -1; i < carrinho; i++) {
////        }
//            System.out.println(getCarrinho());
//
//    }


    public int getEstoque(int quantidadeComprada) {

        return estoque - quantidadeComprada;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getSaldoMaquina() {
        return saldoMaquina;
    }

    public void setSaldoMaquina(int saldoMaquina) {
        this.saldoMaquina = saldoMaquina;
    }

    public int getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(int valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public int getTroco() {
        return troco;
    }

    public void setTroco(int troco) {
        this.troco = troco;
    }

    public int getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(int carrinho) {
        this.carrinho = carrinho;
    }

    public boolean isPagAprov() {
        return pagAprov;
    }

    public void setPagAprov(boolean pagAprov) {
        this.pagAprov = pagAprov;
    }
}
