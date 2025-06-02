package controller;

import model.ListaEncadeadaSimples;
import model.No;
import java.util.Scanner;

public class ListaController{
	
	private ListaEncadeadaSimples<Integer> lista;
	private Scanner sc;
	
	public ListaController(){
		this.lista = new ListaEncadeadaSimples<Integer>();
		this.sc = new Scanner(System.in);
	}
	
	public void adicionar() {
		System.out.println("Insira a posição para inserção: ");
		int index = sc.nextInt();
		System.out.println("Insira o valor para inserção: ");
		int valor = sc.nextInt();
		
		lista.insert(index, valor);
	}
	
	public void remover() {
		System.out.println("Insira a posição para remoção: ");
		int index = sc.nextInt();
		
		lista.remove(index);
	}
	
	public void buscar() throws Exception{
		System.out.println("Insira a posição para busca: ");
		int index = sc.nextInt();
		
		No<Integer> item = lista.get(index);
		
		System.out.println("Valor buscado: " + item.getValor());
	}
	
	public void imprimir() {
		System.out.println("Lista: ");
		System.out.println(lista.toString());
	}
}