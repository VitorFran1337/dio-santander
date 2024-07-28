class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (valor <= getSaldo() + limite)) {
            return super.sacar(valor);
        } else {
            System.out.println("Saldo e limite insuficientes para o saque.");
            return false;
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Corrente:");
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Limite: R$ " + limite);
    }
}