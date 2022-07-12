package horaDeCodar;

import java.util.Scanner;

public class Dois {
	public static void main(String[]args){
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome");
		String nomeUsuario = entrada.nextLine();
		System.out.println(nomeUsuario);
	
		entrada.close();
	}

}
