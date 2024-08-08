import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Dígito o número da conta: ");
            Integer numero = scanner.nextInt();

            System.out.println("Digite a agência: ");
            String agencia = scanner.next();

            System.out.println("Digite o nome do cliente: ");
            String nomeCliente = scanner.next();

            System.out.println("Digite o saldo: ");
            BigDecimal saldo = scanner.nextBigDecimal();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Erro ao ler os dados da conta. Tente novamente.");
        }
    }
}