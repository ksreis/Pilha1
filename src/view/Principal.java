package view;
import java.util.Scanner;
import controller.FatController;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        
        do {
            System.out.print("Digite um número de 0 a 10: ");
            valor = scanner.nextInt();
        } while (valor < 0 || valor > 10);
        
        FatController fatController = new FatController();
        int resultado = fatController.fatorial(valor);
        
        System.out.println("O fatorial de " + valor + " é " + resultado + ".");
    }
}
