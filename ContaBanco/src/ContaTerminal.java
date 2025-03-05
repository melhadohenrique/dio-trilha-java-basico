import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, pode me infomar o seu nome");

        String nomeUsuario = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta");

        int numeroConta = Integer.parseInt(scanner.nextLine());;

        System.out.println("Agora digite o número da agência");

        String agenciaConta = scanner.nextLine();

        System.out.println("Por fim digite o saldo da conta");

        double saldoConta = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível para saque");

    }
}
