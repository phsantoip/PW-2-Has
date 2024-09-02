package model;

public abstract class Livro  implements Exemplar{
    //Atributos
    private String titulo;
    private Autor autor;
    private double preco;
    private String resumo;
    private int paginas;
    private Editora editora;

    //Método construtor
    public Livro(String titulo){
        this.titulo = titulo;
    }
    public Livro(String titulo,double preco){
        this.titulo = titulo;
        this.preco = preco;
    }
    public Livro(){}
    //Metodos
    //public tipo_retorno nomeMetodo([parametros]){}
    public String exibirDadosDoLivro(){
        String dadosLivro = "DETALHES DO LIVRO\n"
                + this.titulo
                + "\nmodel.Autor:" + this.autor.nome
                + "\nmodel.Editora: " + this.editora.nome
                + "\n\nResumo: " + this.resumo
                + "\nPreço: " + this.preco;
        return dadosLivro;
    }
    public abstract void exibirDados();

    //+ calcularDesconto(percentualDeDesconto: double): double
    public double aplicarDesconto(double percentualDeDesconto){

        return this.preco * percentualDeDesconto / 100;
    }
    public void aplicarDesconto(){
        this.preco = this.preco * (0.15);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

}
