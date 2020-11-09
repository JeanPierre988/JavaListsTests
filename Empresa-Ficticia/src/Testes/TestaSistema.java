package Testes;

import Modulos.*;

import java.util.ArrayList;
import java.util.List;

public class TestaSistema {
    public static void main(String[] args) {
        Pessoa pj = new PessoaJuridica("Fulano", "12321/0001-1");
        Pessoa pf = new PessoaFisica("Beltrano", "321654-3");
        Pessoa pf2 = new PessoaFisica("Cicrano", "45813-5");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pj);
        pessoas.add(pf);
        pessoas.add(pf2);

        ContaCorrente ccPf = new ContaCorrente(pf, 3000, 352001);
        ContaCorrente ccPf2 = new ContaCorrente(pf2, 3000, 352001);
        ContaCorrente ccPj = new ContaCorrente(pj, 2000, 314204);
        System.out.println();

        /*System.out.println("-------------Testes.Teste Transferência-----------------");
        ccPf.deposita(1000);
        ccPf.transferencia(pj, 1100);
        ccPf.setChequeEspecial();
        ccPf.transferencia(pj, 1100);
        System.out.println("Saldo PF-CC = " +ccPf.extrato());
        System.out.println("Saldo PJ-CC = " +ccPj.extrato());
        System.out.println(ccPf.getTotalContas());*/

        System.out.println("------------Testes Novos------------------");
//        System.out.println(ccPf);

        System.out.println("------Testes.Teste ArrayList-------------");
        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(ccPf);
        listaContas.add(ccPj);

        for (Conta contaRef : listaContas) {
            System.out.println(contaRef);
            if (contaRef.equals(ccPf2)) {
                System.out.println("Modulos.Conta igual!");
                break;
            } else {
                System.out.println("Modulos.Conta única.");
            }
        }

        System.out.println("------------WildCards----------------");
        printTipo(listaContas);
    }

    public static void printTipo(List<? extends Conta> cc) {
        for (Conta conta : cc) {
            System.out.println(cc);
        }
    }
}
