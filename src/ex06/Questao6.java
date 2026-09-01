package ex06;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome da pessoa");
        String nomeDaPessoa = sc.nextLine();
        IO.println("Digite a idade da pessoa");
        int idadeDaPessoa = sc.nextInt();
        sc.nextLine();
        Funcionario pessoa = new Funcionario(nomeDaPessoa, idadeDaPessoa);
        IO.println("Digite o salario desse funcionario");
        double salario = sc.nextDouble();
        pessoa.setSalarioDoFuncionario(salario);
        IO.println(pessoa);
        sc.close();
    }



}
