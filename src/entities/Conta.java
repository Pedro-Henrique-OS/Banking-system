package entities;

public class Conta {
    private String titular;
    private int numeroDaConta;
    private Double saldo;

    public Conta(){

    }
    public Conta (String titular,int numeroDaConta,Double saldo){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void Deposito(Double deposito){
        saldo += deposito;
    }

    public void Saque(Double saque){
        saldo -= saque;
    }

    @Override
    public String toString(){
        return "Titular: "+ titular +
                "Número da conta: " + numeroDaConta
                + " Saldo: " + saldo;
    }
}
