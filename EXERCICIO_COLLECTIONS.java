package EXERCICIO_03_COLLECTIONS;

import java.util.ArrayList;

public class EXERCICIO_COLLECTIONS {

	public static void main(String[] args) {
		//Armazenando dados
		String peça1= "Camisa branca";
		String peça2= "Calça Jeans";
		String peça3="Blusa branca";
		String peça4="Sobretudo Preto";
		String peça5="Cacharrel branca";
		String peça6="Cacharrel preta";
		String peça7= "Suéter colorido";
		
		//Criando lista:
		ArrayList<String> estoque= new ArrayList<>();
		
		estoque.add(peça1);
		estoque.add(peça2);
		estoque.add(peça3);
		estoque.add(peça4);
		estoque.add(peça5);
		estoque.add(peça6);
		estoque.add(peça7);
		
		//imprimindo lista
		System.out.println("=========Estoque da loja Generation==========\n");
		for(String n:estoque) 
		{
			System.out.println( n);
		}	
		System.out.println("");
		
		//removendo dado da lista (posição)
		System.out.println("\nItens em falta(removidos): ");
		System.out.println(peça4);//---->[posição 3]
		estoque.remove(3);
		
		//atualizando com novas peças
		ArrayList<String> estoqueAtualizado= new ArrayList<>();
		
		String peça8= "Moletom Cinza";
		String peça9="Tênis preto básico";
		
		estoqueAtualizado.add(peça8);
		estoqueAtualizado.add(peça9);
		
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
