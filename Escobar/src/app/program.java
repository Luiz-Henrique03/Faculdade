package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Estoque;
import Entidades.Produto;

public class program {

	public static void main(String[] args) {
		System.out.println("Digite o numero de produtos a serem cadastrados");
		Scanner sc = new Scanner(System.in);
		int numProdutos = sc.nextInt();
		List<Produto> prod = new ArrayList<>(numProdutos);
		Estoque est = new Estoque();
		
		for(int i = 0; i < numProdutos; i++) {
			Produto produto = new Produto();
			prod.add(produto.Adicionaproduto());
		}
		
		est.ProdutosEmEstoque(prod);
		Produto prod2 = new Produto();
	}

}
