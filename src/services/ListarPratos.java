package services;

import repository.RepositorioPratos;
import models.Pratos;

import java.util.Scanner;

public class ListarPratos {
    private RepositorioPratos repositorio;

    public ListarPratos(RepositorioPratos repositorio) {
        this.repositorio = repositorio;
    }

    public ListarPratos() {
        this.repositorio = new RepositorioPratos();
    }

    public void listar(Scanner sc) {
        System.out.println("Lista de Pratos");
        for (Pratos prato : repositorio.getPratosList()) {
            System.out.println(prato);
        }

        System.out.print("\nPressione Enter para voltar ao menu anterior.");
        sc.nextLine();
    }
}
