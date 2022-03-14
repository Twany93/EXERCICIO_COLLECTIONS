package EXERCICIO_03_COLLECTIONS;

import java.util.ArrayList;

public class EXERCICIO_COLLECTIONS {

	public static void main(String[] args) {
		//Armazenando dados
		String pe�a1= "Camisa branca";
		String pe�a2= "Cal�a Jeans";
		String pe�a3="Blusa branca";
		String pe�a4="Sobretudo Preto";
		String pe�a5="Cacharrel branca";
		String pe�a6="Cacharrel preta";
		String pe�a7= "Su�ter colorido";
		
		//Criando lista:
		ArrayList<String> estoque= new ArrayList<>();
		
		estoque.add(pe�a1);
		estoque.add(pe�a2);
		estoque.add(pe�a3);
		estoque.add(pe�a4);
		estoque.add(pe�a5);
		estoque.add(pe�a6);
		estoque.add(pe�a7);
		
		//imprimindo lista
		System.out.println("=========Estoque da loja Generation==========\n");
		for(String n:estoque) 
		{
			System.out.println( n);
		}	
		System.out.println("");
		
		//removendo dado da lista (posi��o)
		System.out.println("\nItens em falta(removidos): ");
		System.out.println(pe�a4);//---->[posi��o 3]
		estoque.remove(3);
		
		//atualizando com novas pe�as
		ArrayList<String> estoqueAtualizado= new ArrayList<>();
		
		String pe�a8= "Moletom Cinza";
		String pe�a9="T�nis preto b�sico";
		
		estoqueAtualizado.add(pe�a8);
		estoqueAtualizado.add(pe�a9);
		
		//imprimindo  a lista com os dados atualizados
		
		System.out.println("\n\nEstoque atualizados: ");
		
		for(String n:estoque) 
		{
			System.out.println(n);
		}	
		for(String n:estoqueAtualizado) 
		{
			System.out.println( n);
		}	
		
	}

}
