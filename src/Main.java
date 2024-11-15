import gui.MenuLogin;
import treatments.Limpeza;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bem-vindo ao Sistema de Restaurante");
        System.out.println("By Maria Iasmin Clementino da Silva");
        Thread.sleep(3000);
        Limpeza.clear();
        MenuLogin.menuLogin();
    }
}