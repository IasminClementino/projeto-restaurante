package models;

import java.time.LocalDateTime;

public class Pedidos {
    private int id;
    private Cliente cliente;
    private Pratos prato;
    private LocalDateTime dataHora;

    public Pedidos() {
    }

    public Pedidos(int id, Cliente cliente, Pratos prato, LocalDateTime dataHora) {
        this.id = id;
        this.cliente = cliente;
        this.prato = prato;
        this.dataHora = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pratos getPrato() {
        return prato;
    }

    public void setPrato(Pratos prato) {
        this.prato = prato;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String toString() {
        return "ID: " + getId() + "\nCliente: " + getCliente() + "\nPrato: " + getPrato() + "\nData e Hora: " + getDataHora();
    }
}
