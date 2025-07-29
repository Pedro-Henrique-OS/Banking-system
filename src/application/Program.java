package application;

import entities.Conta;

public class Program {
    public static void main(String[]args){
        Conta conta = new Conta("Pedro",35,15000.0);
        System.out.println(conta);
        conta.Saque(500.0);
        System.out.println(conta);
        conta.Deposito(1000.0);
        System.out.println(conta);
    }
}
