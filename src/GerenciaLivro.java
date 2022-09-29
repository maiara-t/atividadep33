import java.util.ArrayList;
public class GerenciaLivro extends Livro {


    private ArrayList<Livro> cadastros;

    public GerenciaLivro() {
        super();
        this.cadastros = new ArrayList();
    }


    private boolean cadrastroExistente(String id) {
        if (getId(id) == null) {
            return false;
        }
        return true;
    }

    public void cadastroDeLivro(String id, String nome, String autor, String ano) {
        if (!cadastroExistente(id)) {
            cadastros.add(new Livro(id, nome, autor, ano, TipoDeLivro.Fisico) {
            });
        }
    }


    public void exibir(){
      System.out.println("nome" + getNome());
      System.out.println("genero" +getGenero());
      System.out.println("autor" +getAutor());
      System.out.println("ano" +getAno());
      }
}
