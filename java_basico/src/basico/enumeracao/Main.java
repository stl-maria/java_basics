package basico.enumeracao;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		/** Exemplo dia da semana
		Week today = Week.DOMINGO; // utilizando a enumeração
		
		switch (today) {
		case SEGUNDA:
			System.out.println("Hoje é segunda-feira");
			break;
		case SEXTA:
			System.out.println("Sextou");
			break;
		default:
			System.out.println("Outro dia.");
			break;
			
		}
		**/
		
		Order order = new  Order(1080, new Date(), OrderStatus.DELIVERED);
		System.out.println(order); // no momento de imprimir o enum vira string
		
		// Conversão de String para Enum
		// novo enum
		OrderStatus order2 = OrderStatus.SHIPPED; // instanciando o objeto normalmente
		
		OrderStatus order3 = OrderStatus.valueOf("SHIPPED"); // instanciando o objeto em formato String para enum
		
		System.out.println(order2); 
		System.out.println(order3);
		

	}

}
