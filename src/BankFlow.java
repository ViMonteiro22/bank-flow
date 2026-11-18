import java.util.Scanner;

public class BankFlow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("BANKFLOW | SISTEMA BANCÁRIO \n");

        //DADOS DO CLIENTE

        String nomeTitular = "Victoria Monteiro";
        String tipoConta = "Corrente";
        double saldoContaInicial = 5000.00;

        System.out.println("Nome: " + nomeTitular + "\n"
                + "Tipo da conta: " + tipoConta);
        System.out.printf("Saldo: R$ %.2f%n", saldoContaInicial);
        System.out.println("\n");

        // MENU DE OPÇÕES

        System.out.println("MENU PRINCIPAL");

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção desejada: ");

            opcao = input.nextInt();


        }
    }
}
