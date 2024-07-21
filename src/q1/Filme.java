package q1;

public class Filme extends Publicacao{
    private String diretor;
    private String ator;
    private String sinopse;
    private int duracaoMin;

    public Filme(String titulo, String autor, int anoPubli, String genero, String editora, int qntDisp, String diretor, String ator, String sinopse, int duracaoMin) {
        super(titulo, autor, anoPubli, genero, editora, qntDisp);
        this.setDiretor(diretor);
        this.setAtor(ator);
        this.setSinopse(sinopse);
        this.setDuracaoMin(duracaoMin);

    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Diretor do filme: "+ this.getDiretor());
        System.out.println("Ator principal do filme: "+ this.getAtor());
        System.out.println("Sinopse do filme: "+ this.getSinopse());
        System.out.println("Duração do filme em minutos:"+ this.getDuracaoMin());
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtor() {
        return ator;
    }

    public void setAtor(String ator) {
        this.ator = ator;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }
}
