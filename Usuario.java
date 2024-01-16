import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private static final Publicacoes Publicacoes = null;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private ArrayList<Emprestimo> emprestimos;

    public Usuario(String nome, String telefone, String email, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestimos = new ArrayList<>();
    }

    public boolean podePegarEmprestado() {
        return emprestimos.isEmpty() || emprestimos.size() < 1 || this instanceof UsuarioEspecial;
    }

    public void pegarEmprestado(Publicacoes publicacao, LocalDate dataEmprestimo) {
        if (podePegarEmprestado()) {
            Emprestimo emprestimo = new Emprestimo(this, Publicacoes, dataEmprestimo);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Usuário não pode pegar empréstimo no momento.");
        }
    }

    public void devolver(Publicacoes publicacao) {
        Emprestimo emprestimo = null;
        for (Emprestimo e : emprestimos) {
            if (e.getPublicacao().equals(publicacao)) {
                emprestimo = e;
                break;
            }
        }
        if (emprestimo != null) {
            emprestimo.calcularMulta(publicacao, 0);
            emprestimos.remove(emprestimo);
            System.out.println("Devolução realizada com sucesso!");
        } else {
            System.out.println("Usuário não possui empréstimo dessa publicação.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return this.emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

}