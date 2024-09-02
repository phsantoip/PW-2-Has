package models;

public class Transpote extends Despesa{
    private double kmPercorrida;
    private  double valorPedagios;

    public  void cadastrarDespesa(String descricao, double kmPercorrida,
                                  double valorPedagios){

    }
    @Override
    public double calularDespesa() {
        return 0;
    }

    @Override
    public String listarDespesa() {
        return "Gatos com transpote" +
                "\nDescrição:" + kmPercorrida +
                "\nKm percorido:" + valorPedagios +
                "\nValor totaol de transporte:" + super.getValorTotal()'';
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }
}
