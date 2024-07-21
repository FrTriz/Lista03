package q1;
public class Publicacao {
    private String titulo;
    private String autor;
    private int anoPubli;
    private String genero;
    private String editora;
    private int qntDisp;

    public void imprimirDados(){
        System.out.println("\nDADOS DA PUBLICAÇÃO:\n");
        System.out.println("Título da obra: "+ this.getTitulo());
        System.out.println("Autor da obra; "+ this.getAutor());
        System.out.println("Ano de publicação da obra: "+ this.getAnoPubli());
        System.out.println("Gênero da obra: "+ this.getGenero());
        System.out.println("Editora da obra: "+ this.getEditora());
        System.out.println("Quantidade disponível: "+ this.getQntDisp());
    }

    public Publicacao(String titulo, String autor, int anoPubli, String genero, String editora, int qntDisp) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.genero = genero;
        this.editora = editora;
        this.qntDisp = qntDisp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQntDisp() {
        return qntDisp;
    }

    public void setQntDisp(int qntDisp) {
        this.qntDisp = qntDisp;
    }
}

