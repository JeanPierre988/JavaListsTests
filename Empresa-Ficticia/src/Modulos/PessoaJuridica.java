package Modulos;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        setCnpj(cnpj);
        System.out.println("Modulos.Pessoa Juridica cadastrada.");
        System.out.println("Dados da Modulos.Pessoa Juridica: Nome = " + super.getNome() + ", CNPJ = " + this.getCnpj() +".");
        System.out.println();
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
