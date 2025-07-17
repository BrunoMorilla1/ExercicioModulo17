    package model;

    public class Sedan extends Carro {
        public Sedan(String modelo, String marca, String cor, int ano) {
            super(modelo, marca, cor, ano);
        }

        @Override
        public String toString() {
            return super.toString() + " [Tipo: Sedan]";
        }
    }