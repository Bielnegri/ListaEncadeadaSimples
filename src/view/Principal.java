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
				System.out.println("Escolha a opção desejada: \n1-Adicionar \n2-Adicionar por Posição \n3-Remover \n4-Buscar \n5-Inverter Lista \n6-Imprimir Lista \n9-Finalizar");
				escolha = sc.nextInt();
				
				switch(escolha) {
					case 1:
						lista.adicionar();
						break;
					case 2:
						lista.adicionarPos();
						break;
					case 3:
						lista.remover();
						break;
					case 4:
						lista.buscar();
						break;
					case 5:
						lista.inverter();
						break;
					case 6:
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