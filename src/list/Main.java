package list;

import list.Exe1.LinkedListExe1;
import list.Exe1.NodeExe1;
import list.Exe2.LinkedListExe2;
import list.Exe2.NodeExe2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Main {
	
	public static void bubbleSortWithString(LinkedListExe2 list) {
		if (list.isEmpty())
			System.out.println("List is currently empty.");
		else if (list.size() == 1)
			System.out.println("List is already sorted.");
		else {
			NodeExe2 current = list.getHead();
			NodeExe2 counter = current;
			while (counter.getNext().getNext() != null) {
				current = list.getHead();
				while (current.getNext() != null) {
					if (current.getData().compareTo(current.getNext().getData()) > 0) {
						String temp = current.getData();
						current.setData(current.getNext().getData());
						current.getNext().setData(temp);
					}
					current = current.getNext();
				}
				counter = counter.getNext();
			}
		}
	}
	
	
	public static void bubbleSortWithInt(LinkedListExe1 list) {
		if (list.isEmpty())
			System.out.println("List is currently empty.");
		else if (list.size() == 1)
			System.out.println("List is already sorted.");
		else {
			NodeExe1 current = list.getHead();
			NodeExe1 counter = current;
			while (counter.getNext().getNext() != null) {
				current = list.getHead();
				while (current.getNext() != null) {
					if (current.getData() > current.getNext().getData()) {
						int temp = current.getData();
						current.setData(current.getNext().getData());
						current.getNext().setData(temp);
					}
					current = current.getNext();
				}
				counter = counter.getNext();
			}
		}
	}
	
	public static void exe1() {
		LinkedListExe1 listaInicial = new LinkedListExe1();
		Random gerador = new Random();
		
		for (int i = 0; i < 10; i++) {
			listaInicial.insert(gerador.nextInt(100000));
		}
		
		System.out.printf("\nConteúdo da lista Inicial\n");
		for (int i = 0; i < listaInicial.size(); i++) {
			System.out.println(" " + listaInicial.get(i));
		}
		
		//--------------------------------------------------------
		//Exercício 01
		//Letra a
		
		list.Exe1.LinkedListExe1 listaA = new LinkedListExe1();
		
		System.out.printf("\nConteúdo da lista A  \n");
		for (int i = 0; i < listaInicial.size(); i++) {
			listaA.orderedInsert(listaInicial.get(i));
		}
		for (int i = 0; i < listaA.size(); i++) {
			System.out.println(" " + listaA.get(i));
		}
		
		
		//---------------------------------------------------
		//Letra b
		
		list.Exe1.LinkedListExe1 listaB = listaInicial;
		
		System.out.printf("\nConteúdo da lista B Inicial \n");
		for (int i = 0; i < listaB.size(); i++) {
			System.out.println(" " + listaB.get(i));
		}
		
		bubbleSortWithInt(listaB);
		
		System.out.printf("\nConteúdo da lista B Após ordenar\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(" " + listaB.get(i));
		}
		
		//------------------------------------------------------
		//Letra C
		
		LinkedListExe1 listaC = new LinkedListExe1();
		
		int i = 0;
		do {
			int value = gerador.nextInt(100000);
			if (!listaC.contains(value)) {
				listaC.insert(value);
				i++;
			}
			
		} while (i <= 10);
		
		System.out.printf("\nConteúdo da listaC Inicial\n");
		for (int j = 0; j < listaC.size(); j++) {
			System.out.println(" " + listaC.get(j));
		}
	}
	
	public static void exe2() {
		
		//--------------------------------------------------------
		//Exercício 02
		//Letra a
		LinkedListExe2 listaA = new LinkedListExe2();
		
		try {
			BufferedReader lerArq = new BufferedReader(new FileReader("./src/list/Exe2/exe2.txt"));
			String linha = lerArq.readLine();
			
			while (linha != null) {
				listaA.insert(linha);
				linha = lerArq.readLine();  // lê da segunda até a última linha
			}
			
			System.out.printf("\nConteúdo da lista A \n");
			for (int i = 0; i <= listaA.size(); i++) {
				System.out.println(" " + listaA.get(i));
			}
			
			
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
		
		//----------------------------------------------------------------
		//Letra B
		LinkedListExe2 listaB = listaA;
		bubbleSortWithString(listaB);
		
		System.out.printf("\nConteúdo da lista B\n");
		for (int i = 0; i <= listaB.size(); i++) {
			System.out.println(" " + listaB.get(i));
		}
		
	}
	

	
	
	public static void main(String[] args) {
		
		//EXERCÌCIO 1:
		exe1();
		
		//-----------------------------------------
		//EXERCÌCÌO 2;
		exe2();
		
	}
}
