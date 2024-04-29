package models;

public class Vendedor extends Funcionario{
    private double comissao;
    //Sobrescrita
    @Override
    public double calcularBonificacao() {
        return super.calcularBonificacao() + 500;
    }

    public double calculoComissao(double valorVendido){
        this.comissao = valorVendido * 0.1;
        return getSalario() + this.comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
