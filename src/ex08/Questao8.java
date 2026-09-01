package ex08;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome do livro");
        String nomeDoProduto = sc.nextLine();
        IO.println("Digite o preco do produto");
        double precoDoProduto = sc.nextDouble();
        sc.nextLine();
        Livro produto = new Livro(nomeDoProduto, precoDoProduto);
        IO.println("Digite o nome do autor deste livro");
        String nomeDoAutor = sc.nextLine();
        produto.setNomeDoAutor(nomeDoAutor);
        IO.println(produto);
        sc.close();
    }
}
