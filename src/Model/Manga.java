package Model;

import Model.Livro;

public class Manga extends Livro  {
    // atributos
    protected boolean PaginaPretoBranco;
    protected boolean LerTrasPraFrente;

    // construtor
    public Manga(int id, String nome, String genero, String autor, int paginas, double preco, boolean paginaPretoBranco,
            boolean lerTrasPraFrente) {
        super(id, nome, genero, autor, paginas, preco);
        PaginaPretoBranco = paginaPretoBranco;
        LerTrasPraFrente = lerTrasPraFrente;
    }

    public Manga(int id, String nome, String genero, String autor, int paginas, Double preco, boolean alugado, boolean PaginaPretoBranco, boolean LerTrasPraFrente) {
        super(nome, genero, autor, paginas, preco, id, alugado);
        this.PaginaPretoBranco = PaginaPretoBranco;
        this.LerTrasPraFrente = LerTrasPraFrente;
    }
    
    public Manga(String nome ){
        super(nome);
    }

    public Manga(int id) {
        super(id);
    }

    public Manga(String nome, int id) {
        super(nome,id);
    }
    

    // getters & setters
    public boolean getPaginaPretoBranco() {
        return PaginaPretoBranco;
    }

    public void setPaginaPretoBranco(boolean paginaPretoBranco) {
        PaginaPretoBranco = paginaPretoBranco;
    }

    public boolean getLerTrasPraFrente() {
        return LerTrasPraFrente;
    }

    public void setLerTrasPraFrente(boolean lerTrasPraFrente) {
        LerTrasPraFrente = lerTrasPraFrente;
    }

}
