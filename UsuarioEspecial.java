public class UsuarioEspecial extends Usuario {

    public UsuarioEspecial(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
    }

    @Override
    public boolean podePegarEmprestado() {
        return true;
    }
}
