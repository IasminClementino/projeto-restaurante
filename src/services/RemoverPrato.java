package services;

import repository.RepositorioPratos;
import models.Pratos;
import java.util.Scanner;

public class RemoverPrato {
    private RepositorioPratos repositorio;

    public RemoverPrato(RepositorioPratos repositorio) {
        this.repositorio = repositorio;
    }

    public void remover() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID do prato a ser removido: ");
        int idPratoRemover = sc.nextInt();
        Pratos pratoRemover = repositorio.findPratoById(idPratoRemover);
        if (pratoRemover != null) {
            repositorio.removePrato(pratoRemover);
            System.out.println("Prato removido com sucesso!");
        } else {
            System.out.println("Prato não encontrado!");
        }
    }
}
