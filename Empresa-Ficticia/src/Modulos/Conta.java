package Modulos;

public abstract class Conta {
    private int agencia;
    private int numero;
    protected double saldo = 0;
    private static Pessoa titular;
    private int totalContas;

    public Conta(Pessoa titular, int agencia, int numero) {
        titular.setConta(this);
        this.titular = titular;
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.totalContas++;
    }

    public String getTitular() {
        return titular.getNome();
    }

    public double extrato() {
        return this.saldo;
    }

    public void deposita(double valor) {
        this.saldo = valor;
        System.out.println("Deposito no valor de R$" + valor + " concluido com sucesso!");
        System.out.println();
    }

    public void deposita(Pessoa titular, double valor) {
        if (titular.getConta() != null) {
            titular.getConta().deposita(valor);
        }
    }

    public boolean saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferencia(Pessoa titular, double valor) {
        if (titular.getConta() != null) {
            if (this.saque(valor)) {
                titular.getConta().deposita(valor);
                return true;
            }
            System.out.println("Saldo Insuficiente!");
            return false;
        }
        System.out.println("Modulos.Conta inexistente!");
        return false;
    }

    @Override
    public String toString() {
        return "Modulos.Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    /*****GETS e SETS*****/
    public int getTotalContas() {
        return totalContas;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
