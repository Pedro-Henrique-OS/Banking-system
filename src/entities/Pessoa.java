package entities;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;

    public Pessoa(String nome,String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract String getIdentificador();


}
