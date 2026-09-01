package ex01;

import java.util.Locale;
import java.util.Scanner;

public class questao1 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de produtos que deseja registrar");
        int numeroDeProdutos = sc.nextInt();
        sc.nextLine();
        ProdutoDaQuestao1[] produtos = new ProdutoDaQuestao1[numeroDeProdutos];
        for(int i = 0; i < produtos.length; i++){
            System.out.println("Digite o nome do produto");
            String nomeDoProduto = sc.nextLine();
            System.out.println("Digite a quantidade do produto");
            int quantidadeDoProduto = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o preco do produto");
            double precoDoProduto = sc.nextDouble();
            sc.nextLine();
            produtos[i] = new ProdutoDaQuestao1(nomeDoProduto, quantidadeDoProduto, precoDoProduto);
        }

        for(int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i]);
        }




        sc.close();
    }
}
