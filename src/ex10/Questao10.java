package ex10;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite a marca do celular");
        String marcaDoCelular = sc.nextLine();
        IO.println("Digite o armazenamento do celular");
        String armazenamentoDoCelular = sc.nextLine();
        IO.println("Digite o modelo do celular");
        String modeloDoCelular = sc.nextLine();
        Celular celular1 = new Celular(marcaDoCelular, modeloDoCelular, armazenamentoDoCelular);
        Celular celular2 = new Celular(marcaDoCelular, modeloDoCelular);
        Celular celular3 = new Celular(marcaDoCelular);
        IO.println(celular1.exibirDados());
        IO.println(celular2.exibirDados());
        IO.println(celular3.exibirDados());
    }
}
