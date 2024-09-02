package model;

public class LivroBolso extends Livro{
    @Override
    public void exibirDados() {

    }

    @Override
    public double getValor() {
        return getPreco();
    }
}
