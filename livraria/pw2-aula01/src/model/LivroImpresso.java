package model;

import model.enums.TipoCapaEnum;

public class LivroImpresso extends Livro{
    private TipoCapaEnum tipoCapa;

    public void cobrarCapa(){
        if(tipoCapa == TipoCapaEnum.DURA)
            setPreco(getPreco() + 3);
        else if(tipoCapa == TipoCapaEnum.PERSONALIZADA)
            setPreco(getPreco() + 10);
    }
    public double getEnvio(){
        return this.getPreco() * 0.05;
    }
    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }

    @Override
    public void exibirDados() {
        String dadosLivro = "DETALHES DO LIVRO\n"
                + this.getTitulo()
                + "\nmodel.Autor:" + this.getAutor().nome
                + "\nmodel.Editora: " + this.getEditora().nome
                + "\n\nResumo: " + this.getResumo()
                + "\nPreço: " + this.getPreco()
                + "\nTipo Capa: " + this.tipoCapa;
        System.out.println(dadosLivro);
    }

    @Override
    public double getValor() {
         return getPreco();
    }
}
