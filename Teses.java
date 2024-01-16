import java.util.ArrayList;

public class Teses extends Publicacoes {
    private String autor;
    private String numPaginas;
    private String resumo;
    private String dataDefesa;
    private String instituicao;

    public Teses(String titulo, String dataPublicacao, ArrayList<Referencias> referencias, String autor,
            String numPaginas, String resumo, String dataDefesa, String instituicao) {
        super(titulo, dataPublicacao, referencias);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getResumo() {
        return this.resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDefesa() {
        return this.dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

}
