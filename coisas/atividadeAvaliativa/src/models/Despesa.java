package models;
//192.168.2.167 - inletex

/**
 * @author Eliane
 * @version 1.0
 */
public abstract class Despesa {
    private String descricao;
    private double valorTotal;

    /**
     * O método cadastrarDespesa deve receber a descrição
     * e armazenar no respectivo atributo e
     * deverá inicializar o valorTotal com zero.
     * @param descricao
     */
    public void cadastrarDespesa(String descricao){
        this.descricao = descricao;
        this.valorTotal = 0;
    }
    public abstract double calularDespesa();
    public abstract String listarDespesa();
    /* ---- Getters and Setters ---- */

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
