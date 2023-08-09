package Entidades;

import java.util.List;
import java.util.Scanner;

public class Produto {
	
	private int cod;
	private String nome;
	private double preço;
	
	public Produto() {
		
	}
	
	public Produto(int cod, String nome, double preço) {
		this.cod = cod;
		this.nome = nome;
		this.preço = preço;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public Produto Adicionaproduto() {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		String nome = sc.next();
		double preco = sc.nextDouble();
		return new Produto(codigo,nome,preco);
	}
	
	public Produto buscarProdutoPorCodigo(List<Produto> prod, int codigo) {
		return prod.get(codigo);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Produto: %s, Código: %f", this.nome, this.preço);
	}
	
	
	
}
