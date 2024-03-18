public class Livro {

    String titulo;
    Autor autor;
    double preco;
    String resumo;
    int paginas;
    Editora editora;
    TipoCapaenum tipoCapa;

    //Metodos
    //plubic tipo_retorno nomeMetodo([parametro]){}
    public String exibirDadosDoLivro() {
        String dadosLivro = "DETALHES DO LIVROS\n"
                + this.titulo
                + "\nAutor:" + this.autor.nome
                + "\nEditora:" + this.editora.nome
                + "\nResumo:" + this.resumo
                + "\nPreço:" + this.preco;


    }
    //+ calcularDesconto(percentualDeDesconto: duble):
    public double calcularDesconto(double pencentualDeDEesconto){
        return this.preco * percentualDeDesconto / 100;

    public Livro(String titulo,double preco){
        this.titulo = titulo;
        this.preco = preco;
        }
    public Livro(){}
        
    }
}
