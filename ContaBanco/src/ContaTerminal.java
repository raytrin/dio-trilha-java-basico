import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("*   Bem-vindo(a) ao Banco!   *");
        System.out.println("******************************");
        System.out.println("Vamos criar sua conta bancária.");
        System.out.println("Por favor insira as informações necessárias.");



        System.out.println("Por favor insira seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor insira o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor insira o número da conta: ");
        String conta = scanner.nextLine();

        System.out.println("Qual será seu saldo inicial? ");
        double saldoInicial = scanner.nextDouble();



        System.out.println("Olá, ".concat(nomeCliente).concat("! Obrigado(a) por criar uma conta em nosso banco. Estamos muito felizes por tê-lo(a) conosco!"));
        System.out.println("Aqui estão os detalhes da sua nova conta: ");

        System.out.println("******************************************");

        System.out.println("AGÊNCIA: ".concat(agencia));

        System.out.println("CONTA: ".concat(conta));

        System.out.println("SALDO: R$ ".concat(Double.toString(saldoInicial)));

        System.out.println("******************************************");
        System.out.println("* Seu saldo já está disponível para saque! *");



    }
}
