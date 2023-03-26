package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
    public <integer> int fatorial(int valor) {
        Pilha pl = new Pilha();

        int resultado = 1;
        for (int i = valor; i > 1; i--) { 
            resultado *= i;        
        }
        System.out.println("Pilha de execução do fatorial: " + pl); 

        return resultado;
    }
}