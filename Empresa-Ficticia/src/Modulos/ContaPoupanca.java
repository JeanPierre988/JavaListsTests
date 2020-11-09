package Modulos;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
        System.out.println("Modulos.Conta Poupança criada com sucesso!");
        System.out.println("Dados da conta: Titular = "+titular.getNome()+", AG = "+ this.getAgencia()+", Num = " + this.getNumero() + ".");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Modulos.Conta Poupança{" +
                "agencia=" + this.getAgencia() +
                ", numero=" + this.getNumero() +
                ", saldo=" + this.extrato() +
                '}';
    }
}
