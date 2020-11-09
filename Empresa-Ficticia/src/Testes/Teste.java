package Testes;

import java.util.*;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Integer> arrli = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            arrli.add(i);
        }
        System.out.println(arrli);
        System.out.println();
        System.out.println("Tamanho do ArrLi = " + arrli.size());
        arrli.remove(arrli.size() / 2);
        System.out.println("Elemente do meio removido. " + arrli);
    }
}