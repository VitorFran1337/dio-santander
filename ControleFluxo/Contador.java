package ControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int n2 = sc.nextInt();
        
        try {
            contar(n1, n2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException {
        if (n1 > n2) {
            throw new ParametrosInvalidosException();
        }

        for (int i = n1 + 1; i <= n2; i++) {
            System.out.println(i);
        }
    }
    
}
