public class ContaCorrente extends Conta implements Pagamento{
    public ContaCorrente(int numero, String titular, double saldoInicial, Agencia agencia){
        super(numero, titular, saldoInicial, agencia);
    }

    // Pagamento em dinheiro (implementação) ---------------

    @Override 
    public void pagar(double valor){
        if (valor < 0){
            System.out.print("Erro: O valor do pagamento deve ser maior que zero.");
            return ;
        }

        if (valor > getSaldo()){
            System.out.print("Erro: Saldo insuficiente para realizar o pagamento.");
            return ;
        }

        this.saldo -= valor;
        System.out.print("Pagamento em dinheiro efetuado com sucesso!");
        System.out.printf("Saldo atualizado: R$ %.2f\n!", this.saldo);
    }

    // Pagamento via pix (valor e chave PIX)

    public void pagar(double valor, String chavePix){
        if (valor <= 0){
            System.out.print("Erro: O valor do pagamento dever ser maior que zero.");
            return ;
        }

        if (valor > getSaldo()){
            System.out.print("Erro: Saldo insuficiente para realizar o pagamento.");
            return ;
        }

        this.saldo -= valor;
        System.out.print("Pagamento PIX efetuado para a chave: "+ chavePix);
        System.out.printf("Saldo atualizado: R$ %.2f\n ", this.saldo);

    }

    // Pagamento via Cartão (Valor e Número de Parcelas)
    public void pagar(double valor, int parcelas) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
            return;
        }
        if (parcelas <= 0) {
            System.out.println("Erro: A quantidade de parcelas deve ser maior que zero.");
            return;
        }
        if (valor > getSaldo()) {
            System.out.println("Erro: Saldo insuficiente para realizar o pagamento.");
            return;
        }
        double valorParcela = valor / parcelas;
        this.saldo -= valor;
        System.out.printf("Pagamento no cartão efetuado em %d x de R$ %.2f\n", parcelas, valorParcela);
        System.out.printf("Saldo atualizado: R$ %.2f\n", this.saldo);
    }

}
