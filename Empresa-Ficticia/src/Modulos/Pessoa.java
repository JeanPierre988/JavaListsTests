package Modulos;

public abstract class Pessoa {
    private String nome;
    private Conta conta;

    public Pessoa(String nome) {
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return this.conta;
    }
}
