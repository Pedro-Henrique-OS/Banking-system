package services;

import entities.Conta;

public class TransacaoService {

    public void saque(Conta conta, double valor){
        if(valor <= 0){
            throw new RuntimeException("Valor invalido!");
        }

        if(conta.getSaldo() < valor){
            throw new RuntimeException("Saldo insuficiente ");
        }

        conta.debitar(valor);
    }
    public void deposito(Conta conta,double valor){
        if(valor <=0){
            throw new RuntimeException("Valor invalido");
        }

        conta.depositar(valor);
    }


}
