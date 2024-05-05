import java.util.Locale;
import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            ContaTerminal conta = new ContaTerminal();
            
            System.out.println("Por favor, digite o numero do usuario \n");
            conta.numero = scanner.nextInt();
            
            System.out.println("Por favor, digite a agencia do usuario \n");
            conta.agencia = scanner.next();
            
            System.out.println("Por favor, digite o nome do usuario \n");
            conta.nomeCliente = scanner.next();
            scanner.nextLine();
            System.out.println("Por favor, digite o saldo do usuario \n");
            conta.saldo = scanner.nextDouble();
            System.out.println("Ola "+ conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + conta.agencia + ", conta " + conta.numero + " e seu saldo de " + conta.saldo + " ja esta disponivel para saque");
        }
    }
}
