import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome do seu funcionario");
        String nomeDoFuncionario = sc.nextLine();
        FuncionarioDaQuestao4 funcionario = new FuncionarioDaQuestao4(nomeDoFuncionario);
        IO.println("Digite o salario");
        double salarioDoFuncionario = sc.nextDouble();
        sc.nextLine();
        funcionario.setSalarioDoFuncionario(salarioDoFuncionario);
        IO.println(funcionario);
        sc.close();
    }
}
