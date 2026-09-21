import java.util.Scanner;;
public class Principal {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRO INICIAL");
        System.out.print("Número da agência: ");
        int numAgencia = sc.nextInt();
        sc.nextLine(); // quebra linha
        
        System.out.print("Nome da agência: ");
        String nomeAgencia = sc.nextLine();
        
        Agencia agencia = new Agencia(numAgencia, nomeAgencia);
        
        System.out.print("Numero da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine(); // quebra linha
        
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        
        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);

        int opcao = -1;
        do {
            System.out.println("\nMENU");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.mostrarDados();
                    break;

                case 2:
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 4:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPix = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite a chave PIX: ");
                    String chavePix = sc.nextLine();
                    conta.pagar(valorPix, chavePix);
                    break;

                case 5:
                    System.out.print("Digite o valor da compra: ");
                    double valorCartao = sc.nextDouble();
                    System.out.print("Digite a quantidade de parcelas: ");
                    int parcelas = sc.nextInt();
                    conta.pagar(valorCartao, parcelas);
                    break;

                case 6:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorDinheiro = sc.nextDouble();
                    conta.pagar(valorDinheiro);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while (opcao != 0);
            
        
    }
}
