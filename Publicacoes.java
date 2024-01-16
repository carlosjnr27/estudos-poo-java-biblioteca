import java.util.ArrayList;

public abstract class Publicacoes {
    private String titulo;
    private String dataPublicacao;
    private ArrayList<Referencias> referencias;
    private static double valorMulta;

    public Publicacoes(String titulo, String dataPublicacao, ArrayList<Referencias> referencias) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.referencias = referencias;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public ArrayList<Referencias> getReferencias() {
        return this.referencias;
    }

    public void setReferencias(ArrayList<Referencias> referencias) {
        this.referencias = referencias;
    }

    public double getValorMulta() {
        return valorMulta;
    }

}
