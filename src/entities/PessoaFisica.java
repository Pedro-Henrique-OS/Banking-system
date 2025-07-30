package entities;

public class PessoaFisica extends Pessoa{
    private String cpf;

public PessoaFisica(String nome,String endereco,String cpf){
    super(nome,endereco);
    this.cpf = cpf;

}

    @Override
    public String getIdentificador() {
        return cpf;
    }

}
