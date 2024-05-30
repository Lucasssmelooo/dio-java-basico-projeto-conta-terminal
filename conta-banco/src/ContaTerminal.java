import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Importar a classe "Scanner" e criar o objeto "scanner"
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir mensagem inicial ao usuário
        System.out.println("Olá, seja bem-vindo. Vamos criar sua conta. Informe os dados abaixo.");
    
        //Obter os dados necessários para acessar a conta bancária
        System.out.println("Informe seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite agora o número da sua agência:");
        int agencia = scanner.nextInt();

        System.out.println("Informe o número da conta:");
        String conta = scanner.next();

        System.out.println("Qual o seu saldo?");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem final com os dados informados pelo usuário
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta número " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
