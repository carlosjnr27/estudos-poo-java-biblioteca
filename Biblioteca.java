import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livros> Livros;
    private ArrayList<Teses> Teses;
    private ArrayList<Artigos> Artigos;

    public Biblioteca(String nome, String endereco, ArrayList<Livros> Livros, ArrayList<Teses> Teses,
            ArrayList<Artigos> Artigos) {
        this.nome = nome;
        this.endereco = endereco;
        this.Livros = Livros;
        this.Teses = Teses;
        this.Artigos = Artigos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Livros> getLivros() {
        return this.Livros;
    }

    public void setLivros(ArrayList<Livros> Livros) {
        this.Livros = Livros;
    }

    public ArrayList<Teses> getTeses() {
        return this.Teses;
    }

    public void setTeses(ArrayList<Teses> Teses) {
        this.Teses = Teses;
    }

    public ArrayList<Artigos> getArtigos() {
        return this.Artigos;
    }

    public void setArtigos(ArrayList<Artigos> Artigos) {
        this.Artigos = Artigos;
    }

}
