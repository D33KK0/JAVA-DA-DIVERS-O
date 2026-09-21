public class Conta {
    private int numero;
    private String titular;
    protected double saldo;
    private Agencia agencia;

    public Conta(int numero, String titular, double saldoInicial, Agencia agencia){
        
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.agencia = agencia;
    }

    public int getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public Agencia getAgencia(){
        return agencia;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.print("Depósito realizado com sucesso!");
            System.out.printf("Novo saldo: R$ %.2f\n", this.saldo);

        }else{
            System.out.print("Erro: 0 valor do deposito deve ser maior que zero.");
        }
    }

    public void consultarSaldo(){
        System.out.printf("Saldo atual: R$ %.2f\n", this.saldo);
    }

    public void mostrarDados(){
        agencia.mostrarDados();
        System.out.print("Conta: \n"+numero);
        System.out.print("Titular: \n"+titular);
        System.out.print("Saldo: \n"+saldo);

    }

}



