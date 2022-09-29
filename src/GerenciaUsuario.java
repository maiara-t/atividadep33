import java.util.ArrayList;
public class GerenciaUsuario extends Usuario{
    

    private ArrayList<Usuario> cadastros;

    public GerenciaUsuario() {
        super();
        this.cadastros = new ArrayList();
    }
  


      public void cadastroDeUsuario (String nome, String senha, String cpf) {
          if (!contaExistente(cpf)) {
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

