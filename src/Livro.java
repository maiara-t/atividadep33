
public abstract class Livro {

    private String nome;
    private String genero;
    private String autor;
    private String ano;
    private String id;

    public Livro(String nome, String genero, String autor, String ano, TipoDeLivro id) {
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.ano = ano;
        this.id = id;
    }

    public Livro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}