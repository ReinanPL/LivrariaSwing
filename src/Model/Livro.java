package Model;



abstract public class Livro implements Comparable<Livro> {
    // ATRIBUTOS
    protected String nome;
    protected String genero;
    protected String autor;
    protected int paginas;
    protected Double preco;
    protected int id;
    protected boolean alugado;

    /**
     * Construtor
     * @param nome
     * @param genero
     * @param autor
     * @param paginas
     * @param preco
     */
    public Livro(int id, String nome, String genero, String autor, int paginas, Double preco ) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.paginas = paginas;
        this.autor = autor;
        this.preco = preco;
    }

    public Livro(String nome, String genero, String autor, int paginas, Double preco, int id, boolean alugado) {
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
        this.id = id;
        this.alugado = alugado;
    }
    
    
    
    
    public Livro(String nome) {
    this.nome = nome;
    }

    public Livro(int id) {
        this.id = id;
    }

    public Livro(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    
    

    // GETTERS && SETTERS
    
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    
    
    

    public boolean equals(Object o) {	
		Livro outro = (Livro) o;
       return this.getNome().equals(outro.getNome());
	}
  
    public int compareTo(Livro outro){
        Livro outraLivro = (Livro)outro;
        return this.preco.compareTo(outraLivro.preco);
    }
    

    
    

    
    
    

}
