import java.util.ArrayList;

public class Artigos extends Publicacoes {
    private ArrayList<Autor> autores;

    public Artigos(String titulo, String dataPublicacao, ArrayList<Autor> autores, ArrayList<Referencias> referencias) {
        super(titulo, dataPublicacao, referencias);
        this.autores = autores;
    }


    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    

}
