package services;

import models.Cliente;
import models.Pedidos;
import models.Pratos;
import repository.RepositorioPedidos;
import repository.RepositorioPratos;
import treatments.Exceptions;
import java.time.LocalDateTime;
import java.util.Scanner;

import gui.MenuCliente;

public class ComprarPratos {
  private RepositorioPratos repositorioPratos;
  private RepositorioPedidos repositorioPedidos;

  public ComprarPratos(RepositorioPratos repositorioPratos, RepositorioPedidos repositorioPedidos) {
    this.repositorioPratos = repositorioPratos;
    this.repositorioPedidos = repositorioPedidos;
  }

  public void comprarPrato(Cliente cliente, Scanner sc) throws InterruptedException {
    System.out.println("Digite o ID do prato que deseja comprar: ");
    int pratoId = 0;
    try {
      pratoId = sc.nextInt();
      sc.nextLine();
    } catch (Exception e) {
      Exceptions.valorInvalido();
      comprarPrato(cliente, sc);
    }
    

    Pratos prato = repositorioPratos.findPratoById(pratoId);
    if (prato != null) {
      Pedidos pedido = new Pedidos(repositorioPedidos.getPedidosList().size() + 1, cliente, prato, LocalDateTime.now());
      repositorioPedidos.addPedido(pedido);
      System.out.println("Prato comprado com sucesso!");
    } else {
      System.out.println("Prato não encontrado.");
    }

    Thread.sleep(2000);
    MenuCliente.menuCliente(cliente, sc);
    
  }
}
