package model;

public class Carro {
    private String modelo;
    private String marca;
    private String cor;
    private int ano;

    public Carro(String modelo, String marca, String cor, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Marca: " + marca + ", Cor: " + cor + ", Ano: " + ano;
    }
}
