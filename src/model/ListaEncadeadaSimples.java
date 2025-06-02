package model;

import model.No;

public class ListaEncadeadaSimples<T>{
	private No<T> inicio = null;
	
	public No<T> get(int index) throws IllegalArgumentException{
		int i = 0;
		if(this.inicio == null){
			throw new IllegalArgumentException("Não há itens na lista");
		}
		
		No<T> buffer = this.inicio;
		for(i = 0; i < index; i++){
			if(buffer.getProximo() == null){ 
				break;
			}
			buffer = buffer.getProximo();			
		}
		if(i < index){
			throw new IllegalArgumentException("O índice informado não existe");
		}
		return buffer;
	}
	
	public void insert(int index, T elemento) throws IllegalArgumentException{
		No<T> novo = new No<T>(elemento);
		
		if(this.inicio == null) {
			this.inicio = novo;
		}
		else {
			if(index == 0){
				No<T> inicio = this.inicio;
				novo.setProximo(inicio);
				this.inicio = novo;
			}
			else{
				No<T> item = this.get(--index);
				No<T> proximo = item.getProximo();
				
				if(proximo == null) {
					item.setProximo(novo);
				}
				else {
					item.setProximo(novo);
					novo.setProximo(proximo);
				}
			}
		}
	}
	
	public void remove(int index){
		if(index == 0){
			this.inicio.setValor(null);
			if(this.inicio.getProximo() == null){
				this.inicio = null;
			}
			else{
				No<T> buffer = this.inicio.getProximo();
				this.inicio.setProximo(null);
				this.inicio = buffer;
			}
			return;
		}
		else {
			No<T> anterior = this.get(index - 1);
			No<T> item = anterior.getProximo();
			No<T> proximo = item.getProximo();
			anterior.setProximo(proximo);
			item.setProximo(null);
			item.setValor(null);
		}
	}
	
	@Override public String toString(){
		if(this.inicio == null){
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.inicio;
		builder.append(buffer.getValor());
		while(buffer.getProximo() != null){
			builder.append(",");
			buffer = buffer.getProximo();
			builder.append(buffer.getValor());
		}
		builder.append("]");
		return builder.toString();
	}
}