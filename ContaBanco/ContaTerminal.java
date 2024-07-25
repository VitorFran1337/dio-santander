package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int conta;
        String agencia, nome;
        Double saldo; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da conta:");
        conta = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite seu saldo inicial:");
        saldo = sc.nextDouble();

        System.out.println("Ola" + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta "+ conta + " e seu saldo " + 
        saldo + " já está disponível para saque.");
    }
}

        
