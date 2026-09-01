package ex03;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome do titular da conta");
        String nomeDoTitular = sc.nextLine();
        ContaBancariaDaQuestao3 conta = new ContaBancariaDaQuestao3(nomeDoTitular);
        IO.println("Digite o valor que deseja depositar");
        double deposito = sc.nextDouble();
        sc.nextLine();
        conta.deposito(deposito);
        IO.println(conta);
        IO.println("Digite o valor que deseja sacar");
        double saque = sc.nextDouble();
        conta.saque(saque);
        IO.println(conta);
        sc.close();
    }
}
