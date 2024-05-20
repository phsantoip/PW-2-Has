package model;

public class Kindle extends Livro{
    private String marcaDAgua;

    @Override
    public void exibirDados(){
        String dadosLivro = "DETALHES DO LIVRO\n"
                + this.getTitulo()
                + "\nmodel.Autor:" + this.getAutor().nome
                + "\nmodel.Editora: " + this.getEditora().nome
                + "\n\nResumo: " + this.getResumo()
                + "\nPreço: " + this.getPreco()
                + "Marca D'água: " + marcaDAgua;
        System.out.println(dadosLivro);
    }

    @Override
    public double aplicarDesconto(double percentualDeDesconto){
        if(percentualDeDesconto > 0.1){
            System.out.println("Desconto não pode ser maior que 10%");
        }
        else {
            return super.aplicarDesconto(percentualDeDesconto);
        }
        return 0;
    }
    public String getMarcaDAgua() {
        return marcaDAgua;
    }

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    public double getValor() {
        return getPreco();
    }
}
