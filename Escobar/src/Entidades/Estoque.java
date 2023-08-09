package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	
	
	public void ProdutosEmEstoque(List<Produto> prod) {
		for (Produto produto : prod) {
			System.out.println(produto);
		}
	}

}
