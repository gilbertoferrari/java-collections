public class Livro {

    private String autor, titulo;
    private int anoProducao;

    public Livro(String autor, String titulo, int anoProducao){
        this.autor = autor;
        this.titulo = titulo;
        this.anoProducao = anoProducao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", titulo=" + titulo + ", anoProducao=" + anoProducao + "]";
    }

    


}
