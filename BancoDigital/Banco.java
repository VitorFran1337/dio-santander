package BancoDigital;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("João", 1000.00, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 1500.00, 1.5);

        // Exibir informações das contas
        contaCorrente.exibirInformacoes();
        contaPoupanca.exibirInformacoes();

        // Realizar operações nas contas
        contaCorrente.depositar(200.00);
        contaCorrente.sacar(300.00);
        contaPoupanca.aplicarJuros();
        contaPoupanca.transferir(100.00, contaCorrente);

        // Exibir informações após operações
        contaCorrente.exibirInformacoes();
        contaPoupanca.exibirInformacoes();
    }
}
