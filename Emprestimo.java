import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Publicacoes publicacao;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private int numRenovacoes;

    public Emprestimo(Usuario usuario, Publicacoes publicacao, LocalDate dataEmprestimo) {
        this.usuario = usuario;
        this.publicacao = publicacao;
        this.dataEmprestimo = dataEmprestimo;
        this.numRenovacoes = 0;
    }

    public void renovarEmprestimo() {
        if (numRenovacoes < 3) {
            numRenovacoes++;
            dataDevolucao = dataDevolucao.plusDays(7);
            System.out.println("Empréstimo renovado com sucesso!");
        } else {
            System.out.println("Limite de renovações atingido.");
        }
    }

    public double calcularMulta(Publicacoes publicacao, int diasAtraso) {
        double valorMulta = publicacao.getValorMulta();
        int maxRenovacoes = 3;
        if (diasAtraso <= 0) {
            return 0.0;
        } else if (numRenovacoes >= maxRenovacoes) {
            return valorMulta * diasAtraso;
        } else {
            return (valorMulta / 2) * diasAtraso;
        }
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Publicacoes getPublicacao() {
        return this.publicacao;
    }

    public void setPublicacao(Publicacoes publicacao) {
        this.publicacao = publicacao;
    }

    public LocalDate getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getNumRenovacoes() {
        return this.numRenovacoes;
    }

    public void setNumRenovacoes(int numRenovacoes) {
        this.numRenovacoes = numRenovacoes;
    }

}
