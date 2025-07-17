package model;

public class SUV extends Carro {
    public SUV(String modelo, String marca, String cor, int ano) {
        super(modelo, marca, cor, ano);
    }
    @Override
    public String toString() {
        return super.toString() + " [Tipo: SUV]";
    }
}
