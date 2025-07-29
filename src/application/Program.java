package application;

import entities.Conta;
import entities.Pessoa;
import entities.PessoaFisica;

public class Program {
    public static void main(String[]args){
        Pessoa pessoa1 = new PessoaFisica("Pedro","São luis/Ma","61287265340");
        Conta conta = new Conta(pessoa1,31,700.0);
        System.out.println(conta);
        conta.Saque(500.0);
        System.out.println(conta);
        conta.Deposito(0.0);
        System.out.println(conta);
    }
}
