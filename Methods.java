package Password;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Methods {

	char maiores[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
						'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	char menores[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
						'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	
	char numeros[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	char caracteres[] = {'!', '@', '#', '$', '%', '&', '*', '(', ')', '§'};
	
	List<Character> senha = new ArrayList<>();
	Random aleatorio = new Random();
	
	protected Character getMai(Integer mai) {
		
		int i = 0;
		do {
			
		senha.add(maiores[aleatorio.nextInt(26)]);
		i++;
			
		} while(i != mai); 
		
		return ' ';
	}
	
	protected Character getMin(Integer min) {
		
		int i = 0;
		do {
			
		senha.add(menores[aleatorio.nextInt(26)]);
		i++;
			
		} while(i != min); 
		
		return ' ';
	}
	
	protected Character getNum(Integer num) {
		
		int i = 0;
		do {
			
		senha.add(numeros[aleatorio.nextInt(10)]);
		i++;
			
		} while(i != num); 
		
		return ' ';
	}
	
	
	protected Character getChar(Integer caracter) {
		
		int i = 0;
		do {
			
		senha.add(caracteres[aleatorio.nextInt(10)]);
		i++;
			
		} while(i != caracter); 
		
		return ' ';
	}
	
	
	protected String senhaCompleta(Integer maiores, Integer menores, Integer numeros, Integer caracteres) {
		
		senha.add(getMai(maiores));
		senha.add(getMin(menores));
		senha.add(getNum(numeros));
		senha.add(getChar(caracteres));
		
		Collections.shuffle(senha);
		
		senha.stream()
				.map(n -> n.toString())
				.map(n -> n.replace(" ", ""))
				.forEach(System.out::print);
		
		
		return "";
	}
	
}
