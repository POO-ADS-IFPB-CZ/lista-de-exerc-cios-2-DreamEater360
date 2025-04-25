package questao4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        System.out.println("Informe o numero da conta: ");
        int numero = sc.nextInt();
        System.out.println("Informe o titular da conta: ");
        String nome = sc.next();
        float saldo = 0;

        ContaCorrente usuario = new ContaCorrente(numero, nome, saldo);

        while (!sair){
            int opcao = 0;

            System.out.println("=== MENU DA CONTA ===");
            System.out.println("Para SACAR um valor digite 1");
            System.out.println("Para DEPOSITAR um valor digite 2");
            System.out.println("Para CONSULTAR o saldo digite 3");
            System.out.println("=== Para SAIR digite 4 ===");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe o valor a ser sacado: ");
                    usuario.sacar(sc.nextFloat());
                    break;

                case 2:
                    System.out.println("Informe o valor a ser depositado: ");
                    usuario.depositar(sc.nextFloat());
                    break;

                case 3:
                    System.out.println("Seu saldo eh: " + usuario.consultarSaldo());
                    break;

                case 4:
                    sair = true;
            }

        }

    }
}
