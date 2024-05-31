public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marcio");
        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
