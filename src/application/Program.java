package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Tom");
		cookies.put("email", "tom@gmail.com");
		cookies.put("phone", "996478044");
		
		cookies.remove("email");
		/* O MAP é uma coleção de chave/ valor (K, V) que não adimite repetições do objeto chave no exemplo abaixo foi usado a mesma chave "phone" porém com o valor diferente
		quando impresso o valor da chave abaixo subscreve o valor anterior*/
		cookies.put("phone", "999832381");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));//verificar se contem a chave
		System.out.println("Phone number: " + cookies.get("phone"));//"get" pegar o valor de uma chave
		System.out.println("Email: " + cookies.get("email"));//"get" pegar um valor inexistente o MAP retorna Nulo
		
		
		
		
		System.out.println("ALL COOKIES: ");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
	
}
