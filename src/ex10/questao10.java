package ex10;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite a marca do celular");
        String marcaDoCelular = sc.nextLine();
        IO.println("Digite o armazenamento do celular");
        String armazenamentoDoCelular = sc.nextLine();
        IO.println("Digite o modelo do celular");
        String modeloDoCelular = sc.nextLine();
        CelularDaQuestao10 celular1 = new CelularDaQuestao10(marcaDoCelular, modeloDoCelular, armazenamentoDoCelular);
        CelularDaQuestao10 celular2 = new CelularDaQuestao10(marcaDoCelular, modeloDoCelular);
        CelularDaQuestao10 celular3 = new CelularDaQuestao10(marcaDoCelular);
        IO.println(celular1.exibirDados());
        IO.println(celular2.exibirDados());
        IO.println(celular3.exibirDados());
    }
}
