package Modulos;

public class ContaCorrente extends Conta {
    private boolean chequeEspecial = false;

    public ContaCorrente(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
        System.out.println("Modulos.Conta Corrente criada com sucesso!");
        System.out.println("Dados da conta: Titular = " + titular.getNome() + ", AG = " + this.getAgencia() + ", Num = " + this.getNumero() + ".");
        System.out.println();
    }

    public void setChequeEspecial() {
        chequeEspecial = true;
    }

    public boolean isChequeEspecial() {
        System.out.println("Cheque Especial ativo!");
        return chequeEspecial;
    }

    @Override
    public boolean saque(double valor) {
        if (chequeEspecial) {
            super.saldo -= valor;
            return true;
        } else {
            super.saque(valor);
        }
        return false;
    }

    @Override
    public boolean transferencia(Pessoa titular, double valor) {
        if (super.transferencia(titular, valor)) {
            titular.getConta().deposita(valor);
            return true;
        } else {
            return super.transferencia(titular, valor);
        }
    }

    @Override
    public String toString() {
        return "Modulos.Conta Corrente{" +
                "agencia=" + this.getAgencia() +
                ", numero=" + this.getNumero() +
                ", saldo=" + this.extrato() +
                ", cheque especial=" + chequeEspecial +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Conta ccRef = (Conta) o;
        if (ccRef.getNumero() != this.getNumero()) {
            return false;
        }
        if (ccRef.getAgencia() != this.getAgencia()) {
            return false;
        }
        return true;
    }
}
