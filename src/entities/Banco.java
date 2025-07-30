package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeDoBanco;
    private List<Conta> contasList;

    public Banco(String nomeDoBanco){
        this.nomeDoBanco = nomeDoBanco;
        this.contasList = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contasList.add(conta);
    }

    public Conta buscarConta(int numeroConta , int senha){
        for(Conta conta : contasList){
            if(conta.getNumeroDaConta() == numeroConta){
                if(conta.getSenha() == senha){
                    return conta;
                }
                else {
                    throw new RuntimeException("Senha invalida");
                }
            }

        }
        throw new RuntimeException("Número de conta invalido");

    }
}
