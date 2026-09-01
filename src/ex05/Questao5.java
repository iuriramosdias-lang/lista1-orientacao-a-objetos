package ex05;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o primeiro numero inteiro que deseja somar");
        int primeiroNumeroInteiro = sc.nextInt();
        sc.nextLine();
        IO.println("Digite o segundo numero inteiro para somar");
        int segundoNumeroInteiro = sc.nextInt();
        sc.nextLine();
        Calculadora somaDeDoisInteiros = new Calculadora(primeiroNumeroInteiro, segundoNumeroInteiro);
        somaDeDoisInteiros.somaDeDoisInteiros();
        IO.println("Digite o primeiro numero double que deseja somar");
        double primeiroNumeroDouble = sc.nextDouble();
        sc.nextLine();
        IO.println("Digite o segundo numero double para somar");
        double segundoNumeroDouble = sc.nextDouble();
        sc.nextLine();
        Calculadora somaDeDoisDoubles = new Calculadora(primeiroNumeroDouble, segundoNumeroDouble);
        somaDeDoisDoubles.somaDeDoisDoubles();
        IO.println("Digite o primeiro numero inteiro que deseja somar");
        int primeiroDe3NumeroInteiro = sc.nextInt();
        sc.nextLine();
        IO.println("Digite o segundo numero inteiro para somar");
        int segundode3NumeroInteiro = sc.nextInt();
        sc.nextLine();
        IO.println("Digite o terceiro numero inteiro que deseja somar");
        int terceirode3NumeroInteiro = sc.nextInt();
        sc.nextLine();
        Calculadora somaDeTresInteiros= new Calculadora(primeiroDe3NumeroInteiro, segundode3NumeroInteiro, terceirode3NumeroInteiro);
        somaDeTresInteiros.somaDeTresInteiros();
        sc.close();
    }
}
