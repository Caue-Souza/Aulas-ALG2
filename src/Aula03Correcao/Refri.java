package Aula03Correcao;

public class Refri {
    String nome;
    int id ;
    int valor;
    int litros;
    
    Refri(String nome, int id, int valor, int litros){
        this.nome = nome;
        this.id = id;
        this.valor = valor;
        this.litros = litros;
    }

    public Refri() {

    }


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getValor() {

        return valor;
    }

    public void setValor(int valor) {

        this.valor = valor;
    }

    public int getLitros() {

        return litros;
    }

    public void setLitros(int litros) {

        this.litros = litros;
    }


    
}
