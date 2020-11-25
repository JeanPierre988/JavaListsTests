import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class principalTeste {
    public static void main(String[] args) throws IOException {

        List<Ganhador> ganhadorList = new ArrayList<>();
        Scanner scArq = new Scanner(new File("ListaGanhadores.csv"));
        while (scArq.hasNext()) {
            Scanner scLinha = new Scanner(scArq.nextLine());
            scLinha.useDelimiter(",");
            Ganhador ganhador = new Ganhador(scLinha.next(), scLinha.next(), scLinha.next(), scLinha.next());
            ganhadorList.add(ganhador);
            scLinha.close();
        }

        ganhadorList.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Seja bem vindo. Escolha uma opção para ordenar a lista:");
        System.out.println("1) Por Título. 2) Por nome. 3) Por Cidade. 4) Por Ponto de Venda.");
        switch (scanner.nextInt()) {
            case 1:
                ordenaLista(ganhadorList, Comparator.comparing(Ganhador::getTitulo));
                break;
            case 2:
                ordenaLista(ganhadorList, Comparator.comparing(Ganhador::getNome));
                break;
            case 3:
                ordenaLista(ganhadorList, Comparator.comparing(Ganhador::getCidade));
                break;
            case 4:
                ordenaLista(ganhadorList, Comparator.comparing(Ganhador::getPv));
                break;
            default:
                System.out.println("Opção inválida. Terminando");
                break;
        }
    }

    private static void ordenaLista(List<Ganhador> ganhadorList, Comparator<Ganhador> comparing) {
        ganhadorList.sort(comparing);
        ganhadorList.forEach(ganhador ->
                System.out.format("%s - %50s, %20s / %30s\n",
                        ganhador.getTitulo(), ganhador.getNome(), ganhador.getCidade(), ganhador.getPv()));
    }
}
