import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, por favor digite o número de sua conta: (ex: 54879)");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número de sua agência: (ex: 067-8)");
        String agenciaConta = scanner.next();

        System.out.println("Por favor, digite seu nome completo: (ex: João da Silva)");
        String nomeCliente = scanner.next();

        scanner.close();

        double saldoCliente = Math.random() * 15000;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo de R$" + deci.format(saldoCliente) + " já está disponível para saque!");
    }
}
