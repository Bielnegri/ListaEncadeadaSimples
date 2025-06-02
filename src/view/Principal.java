package view;

import controller.ListaController;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args){		
		try{
			ListaController lista = new ListaController();
			Scanner sc = new Scanner(System.in);
			int escolha = 0;
			
			while(escolha != 9) {
				System.out.println("Escolha a opção desejada: \n1-Adicionar \n2-Remover \n3-Buscar \n4-Imprimir Lista \n9-Finalizar");
				escolha = sc.nextInt();
				
				switch(escolha) {
					case 1:
						lista.adicionar();
						break;
					case 2:
						lista.remover();
						break;
					case 3:
						lista.buscar();
						break;
					case 4:
						lista.imprimir();
						break;
					case 9:
						System.out.println("Fim!");
						break;
					default:
						System.out.println("Valor Inválido!");
						break;
				}
			}
			sc.close();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}