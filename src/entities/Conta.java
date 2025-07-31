package entities;

public class Conta {
    private  Pessoa titular;
    private int numeroDaConta;
    private int senha;
    private Double saldo;


    public Conta(){

    }
    public Conta (Pessoa titular, int numeroDaConta,int senha, Double saldo){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.senha = senha;
        this.saldo = saldo;

    }



    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public Double getSaldo(){
        return saldo;
    }
    public int getSenha(){
        return senha;
    }

 // metodos "seguros" para alterar o saldo

    public void debitar(double valor){
        this.saldo -= valor;
    }


    public void depositar(double valor){
        this.saldo += valor;
    }


    public void exibirExtrato() {
        System.out.println("Conta: " + numeroDaConta);
        System.out.println("CPF: " + titular.getIdentificador());
        System.out.println("Titular: " + titular.getNome());
        System.out.println("Saldo: R$ " + saldo);
    }


}
