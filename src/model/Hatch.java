package model;

public class Hatch extends Carro {
    public Hatch(String modelo, String marca, String cor, int ano) {
        super(modelo, marca, cor, ano);
    }
    @Override
    public String toString() {
        return super.toString() + " [Tipo: Hatch]";
    }
}
