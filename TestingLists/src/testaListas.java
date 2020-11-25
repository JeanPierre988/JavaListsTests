import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class testaListas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ListaGanhadores.csv"));
        ArrayList<Ganhador> listaGanhadores = new ArrayList<>();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            Scanner linhaLeitura = new Scanner(linha);
            linhaLeitura.useDelimiter(",");
            Ganhador ganhador = new Ganhador(linhaLeitura.next(), linhaLeitura.next(), linhaLeitura.next(), linhaLeitura.next());
            listaGanhadores.add(ganhador);
        }
        System.out.println("------------------------------------");

        listaGanhadores.sort(Comparator.comparing(Ganhador::getTitulo));
        listaGanhadores.forEach(ganhador -> System.out.format(
                "%s - %40s, %20s / %15s\n", ganhador.getTitulo(), ganhador.getNome(), ganhador.getCidade(), ganhador.getPv()));
//        System.out.println(listaGanhadores);
    }
}
