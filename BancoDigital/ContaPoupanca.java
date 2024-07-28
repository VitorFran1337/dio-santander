package BancoDigital;

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldoInicial, double taxaJuros) {
        super(titular, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * (taxaJuros / 100);
        depositar(juros);
        System.out.println("Juros de R$ " + juros + " aplicados com sucesso.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Poupança:");
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Taxa de Juros: " + taxaJuros + "%");
    }
}

