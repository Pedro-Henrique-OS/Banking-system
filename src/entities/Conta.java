package entities;

public class Conta {
    private  Pessoa titular;
    private int numeroDaConta;
    private Double saldo;


    public Conta(){

    }
    public Conta (Pessoa titular, int numeroDaConta,Double saldo){
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;

    }



    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void Deposito(Double deposito){
        if(deposito > 0){
            saldo += deposito;
        }
        else {
            throw new RuntimeException("Valor invalido para deposito");
        }

    }

    public void Saque(Double saque){
        if(saque<= saldo){
            saldo -= saque;
        }
        else {
            throw new RuntimeException("Saldo insuficiente");
        }

    }

    @Override
    public String toString(){
        return "Titular: "+ titular +
                "Número da conta: " + numeroDaConta
                + " Saldo: " + saldo;
    }
}
