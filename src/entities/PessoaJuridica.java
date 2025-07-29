package entities;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome,String endereco, String cnpj){
        super(nome,endereco);
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificador(){
        return cnpj;
    }
}
