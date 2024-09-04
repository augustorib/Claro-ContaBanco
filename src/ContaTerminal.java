import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = in.nextInt();
        in.nextLine();

        System.out.println("Por favor, digite o número da Agencia: ");
        String agencia = in.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente  = in.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        float saldo  = in.nextFloat();


        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo));
    }
}