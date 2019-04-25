package list;

import java.util.Random;

public class Main {
	
	public static void ordenacaoBubleSort(List<Integer> lista) {
		
		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < (lista.size() - 1 - i); j++) {
				if (lista.get(j) > lista.get(j + 1)) {
					Integer aux = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j + 1, aux);
				}
				System.out.println(lista);
				
			}
		}
		
		System.out.println(lista);
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> listaInicial = new LinkedList<>();
		Random gerador = new Random();
		
		//insere aleatório
		for (int i = 0; i < listaInicial.size(); i++) {
			listaInicial.add(gerador.nextInt(100000));
		}
		
		System.out.printf("\nConteúdo da lista Inicial\n");
		for (int i = 0; i < listaInicial.size(); i++) {
			System.out.println(" " + listaInicial.get(i));
		}
		
		//--------------------------------------------------------
		//Exercício 01
		//Letra a
		
		
		//---------------------------------------------------
		//Letra b
		LinkedList<Integer> listaB = listaInicial;
		
		System.out.printf("\nConteúdo da lista B Inicial \n");
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + listaB.get(i));
		}
		
		ordenacaoBubleSort(listaB);
		
		System.out.printf("\nConteúdo da lista B Após ordenar\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + listaB.get(i));
		}
		
		//------------------------------------------------------
		//Letra C
		
		
	}
}
