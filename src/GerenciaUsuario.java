import java.util.ArrayList;
public class GerenciaUsuario extends Usuario{
    

    private ArrayList<Usuario> cadastros;

    public GerenciaUsuario() {
        super();
        this.cadastros = new ArrayList();
    }

    private boolean cadrastroExistente(String cpf) {
        if (getCpf(cpf) == null) {
            return false;
        }
        return true;
    }

      public void cadastroDeUsuario (String nome, String senha, String cpf) {
          if (!cadastroExistente(cpf)) {
              cadastros.add(new Usuario(nome, senha, cpf) {
              });
          }
      }


      public void exibir(){
          System.out.println("nome" + getNome());
          System.out.println("genero" + getSenha());
          System.out.println("autor" + getCpf());
      }
  }

