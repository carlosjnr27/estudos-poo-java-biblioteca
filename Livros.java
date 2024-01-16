import java.util.ArrayList;

public class Livros extends Publicacoes {
    private String edicao;
    private String editora;
    private String isbn;

    public Livros(String titulo, String edicao, String dataPublicacao, String editora, String isbn,
            ArrayList<Referencias> referencias) {
        super(titulo, dataPublicacao, referencias);
        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;

    }

    public String getEdicao() {
        return this.edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
