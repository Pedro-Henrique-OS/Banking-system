package application;

import entities.Conta;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Nubank ");
        System.out.println("Entrar digite 1");
        System.out.println("Criar conta digite 2");
        int escolha = sc.nextInt();
        sc.nextLine();


        if(escolha == 2){
            System.out.println("Forneça as informações necessárias: ");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Tipo de conta: ");
            System.out.println("Pessoa física digite 1");
            System.out.println("Pessoa jurídica digite 2 ");
            int tipoConta = sc.nextInt();
            sc.nextLine();
            Pessoa pessoa = null;
            if(tipoConta == 1){
                System.out.println("CPF: ");
                String cpf = sc.nextLine();
                pessoa = new PessoaFisica(nome,endereco,cpf);
            }
            else if(tipoConta == 2){
                System.out.println("CNPJ: ");
                String cnpj = sc.nextLine();
                pessoa = new PessoaJuridica(nome,endereco,cnpj);
            }

            System.out.println("Digite sua senha: ");
            int senha = sc.nextInt();
            sc.nextLine();

            Conta conta = new Conta(pessoa,8,senha,500.0);
            System.out.println("Conta criada com sucesso!");

            conta.exibirExtrato();
        }

    }
}
