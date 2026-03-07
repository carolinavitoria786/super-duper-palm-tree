package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista01 {

	public static void main(String[] args) {
		
		//instanciacao da lista
		List<String> list = new ArrayList<>();
		
		//adicao de elementos
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// adiciona o elemento em uma posicao especifica
		list.add(2, "Marco"); 
		
		//exibe o tamanho da lista
		System.out.println(list.size());
		
		//podese remover um dado da lista a partir da comparacao do mesmo com outro similar
		list.remove("Anna");
		// tambem podese remover pelos indices
		list.remove(1);
		//remocao por predicado
		list.removeIf(x -> x.charAt(0) == 'M'); //vai remover todos os elementos que comecam com M

		//localiza o indice do elemento desejado
		list.indexOf("Bob");
		
		//filtro
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		//encontra o primeiro elemento que comeca por A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		// usando o for each
		for (String x : list) {
			System.out.println(x);
		}
		
	}

}
