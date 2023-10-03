import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero_conta;
        String agencia, nome_cliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        numero_conta = sc.nextInt();
        
        sc.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o seu nome!");
        nome_cliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da sua conta!");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

