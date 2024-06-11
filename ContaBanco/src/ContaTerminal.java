import java.util.Scanner;
public class ContaTerminal {
    
	public static void main(String[]args) throws Exception{
		
		Scanner sc = new Scanner(System.in);

            int numeroConta;
            String agencia;
            String nomeCliente;
            double saldo;
            

			System.out.println("Seja Bem Vindo ao Banco Santander");           

            System.out.print("Por favor,digite o numero da conta:");
            
            numeroConta = sc.nextInt();
            
            System.out.println("Agora, Por favor digite o número da Agência: ()");
            agencia = sc.next();
            
            System.out.println("Me informe seu nome: ");
            nomeCliente = sc.next();
            sc.nextLine();
            
            System.out.println("Agora me informa seu saldo atual: ");
            saldo = sc.nextDouble();
            
            System.out.println();
            System.out.printf("Olá Mario Andrade, obrigado por criar uma conta em "
                    + "nosso banco, sua agência é 067-8, "
                    + "conta 1021 e seu saldo 237.48 já está disponível"
                    + " para saque.", nomeCliente, agencia, numeroConta, saldo);
        }
	}
	


