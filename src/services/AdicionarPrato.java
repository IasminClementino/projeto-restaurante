package services;

import gui.MenuAdministracao;
import repository.RepositorioPratos;
import models.Pratos;
import treatments.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdicionarPrato {
    private RepositorioPratos repositorio;
    private static int nextId = 1;

    public AdicionarPrato(RepositorioPratos repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionar(Scanner sc) throws InterruptedException {
        System.out.print("Digite o nome do prato: ");
        String nomePrato = sc.nextLine();
        System.out.print("Digite a descrição do prato: ");
        String descricaoPrato = sc.nextLine();
        System.out.print("Digite o preço do prato: ");
        float precoPrato=0;
        try {
            precoPrato = sc.nextFloat();
        } catch (InputMismatchException e) {
            Exceptions.valorInvalido();
            Thread.sleep(1500);
            MenuAdministracao.administracao(sc);
        }
        Pratos novoPrato = new Pratos(nextId++, nomePrato, descricaoPrato, precoPrato);
        repositorio.addPrato(novoPrato);
        System.out.println("Prato adicionado com sucesso!");
    }
}
