package Modulos;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        setCpf(cpf);
        System.out.println("Modulos.Pessoa Física cadastrada.");
        System.out.println("Dados da Modulos.Pessoa Física: Nome = " + super.getNome() + ", CPF = " + this.getCpf() +".");
        System.out.println();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
