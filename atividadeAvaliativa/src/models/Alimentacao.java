package models;

import javax.swing.plaf.PanelUI;

public class Alimentacao extends Despesa {
    private String nomeRestaurante;
    private int qtdRefeicao;
    public void cadastrarDespesa(String descricao,
                                 String nome, int qtdRefeicao){
        this.nomeRestaurante = nome;
        this.qtdRefeicao = qtdRefeicao;
        super.setDescricao(descricao);
    }

    /**
     * Calcula o valor gasto com refeições e retorna o
     * valor total aplicando a seguinte fórmula:
     * quantidade de refeições * 18
     * @return double
     */
    @Override
    public double calularDespesa() {
        return this.qtdRefeicao * 18;
    }

    @Override
    public String listarDespesa() {
        return null;
    }

    // ---- GETTERS AND SETTERS ----

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }
}
