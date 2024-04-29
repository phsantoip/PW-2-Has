package models;

public class Funcionario {
    private String nome;
    private double salario;

    public double calcularBonificacao(){
        return salario * 0.30;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
