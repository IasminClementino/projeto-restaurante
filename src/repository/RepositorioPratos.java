package repository;

import models.Pratos;
import java.util.ArrayList;

public class RepositorioPratos implements interfaces.InterfacePratos {
    private ArrayList<Pratos> pratosList;

    public RepositorioPratos() {
        this.pratosList = new ArrayList<>();
    }

    public void addPrato(Pratos prato) {
        pratosList.add(prato);
    }

    public void removePrato(Pratos prato) {
        pratosList.remove(prato);
    }

    public ArrayList<Pratos> getPratosList() {
        return pratosList;
    }

    public Pratos findPratoByName(String nome) {
        for (Pratos prato : pratosList) {
            if (prato.getNome().equalsIgnoreCase(nome)) {
                return prato;
            }
        }
        return null;
    }

    public Pratos findPratoById(int id) {
        for (Pratos prato : pratosList) {
            if (prato.getId() == id) {
                return prato;
            }
        }
        return null;
    }
}
