import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e captura dos dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        // Consumir a quebra de linha que fica após a leitura de um número
        scanner.nextLine(); 

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", Obrigado por criar uma conta no LDBANK, sua agência é " + 
                          agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}