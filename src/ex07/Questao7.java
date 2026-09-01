package ex07;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite uma marca de interesse");
        String marca = sc.nextLine();
        IO.println("Digite um modelo ");
        String modelo = sc.nextLine();
        Carro carro = new Carro(marca, modelo);
        Moto moto = new Moto(marca, modelo);
        IO.println("Digite a quantidade de portas do carro");
        int quantidadeDePortas = sc.nextInt();
        sc.nextLine();
        IO.println("Digite a quantidade de cilindradas");
        int cilindradas = sc.nextInt();
        sc.nextLine();
        carro.setQuantidadeDePortas(quantidadeDePortas);
        moto.setCilindradasDaMoto(cilindradas);
        IO.println(carro);
        IO.println("--------------------");
        IO.println(moto);
    }
}
