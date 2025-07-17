import model.Carro;
import model.SUV;
import model.Sedan;
import model.Hatch;
import service.ListaGenerica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaGenerica<Carro> listaDeCarros = new ListaGenerica<>();

        System.out.print("Quantos carros deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n--- Cadastro do carro " + (i + 1) + " ---");

            System.out.print("Tipo (Sedan/SUV/Hatch): ");
            String tipo = sc.nextLine().trim();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Cor: ");
            String cor = sc.nextLine();

            System.out.print("Ano: ");
            int ano = sc.nextInt();
            sc.nextLine(); // limpar buffer

            Carro carro;

            switch (tipo.toLowerCase()) {
                case "sedan":
                    carro = new Sedan(modelo, marca, cor, ano);
                    break;
                case "suv":
                    carro = new SUV(modelo, marca, cor, ano);
                    break;
                case "hatch":
                    carro = new Hatch(modelo, marca, cor, ano);
                    break;
                default:
                    System.out.println("Tipo inválido, cadastrando como Sedan por padrão.");
                    carro = new Sedan(modelo, marca, cor, ano);
                    break;
            }

            listaDeCarros.adicionar(carro);
        }

        System.out.println("\n--- Lista de carros cadastrados ---");
        for (Carro c : listaDeCarros.listar()) {
            System.out.println(c);
        }

        sc.close();
    }
}
