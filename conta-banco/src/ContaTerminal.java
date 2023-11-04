import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo de deposito:");
        double saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nome, numeroAgencia, numeroConta, saldo);

        sc.close();
    }
}
