package desafiosFOR;

import java.util.Scanner;

public class DesafioDaTabuada {
	public static void main(String[] args) {
		int numero;
		//CHAMNDO O SCANNER
		Scanner ler = new Scanner(System.in);
		
		//VARIAVEIS
		 System.out.print("informe um número : ");
		 numero = ler.nextInt();

		   for (int i = 1; i <= 10; i++) {
			   System.out.println(numero + " x " + i + " = " + (numero * i));
		  
			   ler.close();
		        }

		      
		    }
		
		
	}


