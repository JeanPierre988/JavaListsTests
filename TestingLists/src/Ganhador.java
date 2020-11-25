public class Ganhador implements Comparable<Ganhador> {
    private String titulo;
    private String nome;
    private String cidade;
    private String pv;

    public Ganhador(String titulo, String nome, String cidade, String pv) {
        this.titulo = titulo;
        this.nome = nome;
        this.cidade = cidade;
        this.pv = pv;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPv() {
        return pv;
    }

    @Override
    public int compareTo(Ganhador o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Ganhador{" +
                "titulo='" + titulo + '\'' +
                ", nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", pv='" + pv + '\'' +
                '}';
    }
}
