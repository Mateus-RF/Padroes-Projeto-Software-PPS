package ex_prototype;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLO DE USO DO PADRÃO PROTOTYPE ===\n");
        // Gerado by ChatGPT
        // =============================
        //   TRANSPORTES ORIGINAIS
        // =============================
        System.out.println("--- Criando Transportes Originais ---");

        Caminhao caminhaoOriginal = new Caminhao(
            "Caminhão de Carga",
            5000.0,
            80,
            10000.0,
            2,
            false,
            "Baú"
        );

        Navio navioOriginal = new Navio(
            "Navio Cargueiro",
            50000.0,
            40,
            100000.0,
            50,
            "Aço",
            true
        );

        Aviao aviaoOriginal = new Aviao(
            "Avião Cargueiro",
            80000.0,
            850,
            4,
            65.0,
            14000.0
        );

        // Lista polimórfica de originais
        ArrayList<Transporte> originais = new ArrayList<>();
        originais.add(caminhaoOriginal);
        originais.add(navioOriginal);
        originais.add(aviaoOriginal);

        // Exibir originais
        System.out.println("\nTransportes Originais:");
        int index = 1;
        for (Transporte t : originais) {
            System.out.println(index++ + ". " + t);
        }
        // =============================
        //   TRANSPORTES CLONADOS
        // =============================
        System.out.println("\n--- Clonando Transportes ---");

        ArrayList<Transporte> clones = new ArrayList<>();

        // Clonar caminhão 3 vezes
        for (int i = 1; i <= 3; i++) {
            clones.add(caminhaoOriginal.clone());
            System.out.println("Clone " + i + " de Caminhão criado");
        }
        // Clonar navio 2 vezes
        for (int i = 1; i <= 2; i++) {
            clones.add(navioOriginal.clone());
            System.out.println("Clone " + i + " de Navio criado");
        }
        // Clonar avião 2 vezes
        for (int i = 1; i <= 2; i++) {
            clones.add(aviaoOriginal.clone());
            System.out.println("Clone " + i + " de Avião criado");
        }
        // Exibir clones
        System.out.println("\nTransportes Clonados:");
        index = 1;
        for (Transporte t : clones) {
            System.out.println(index++ + ". " + t);
        }
        System.out.println("\n=== Padrão Prototype aplicado com sucesso! ===");
    }
}