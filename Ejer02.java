import java.util.Scanner;

public class Ejer02{
	public static void main(String[] args) {
		/*
		Resultado:
		    precioPagar
		Entrada:
			precioSinOfe
		Proceso:
			precioPagar= precioSinOfe - precioSinOfe*0.22
		*/
		Scanner reader = new Scanner(System.in);
		double precioSinOfe = 0;
		System.out.print("precioSinOfe:");
		precioSinOfe = Double.parseDouble( reader.nextLine() );
		double precioPagar= precioSinOfe - precioSinOfe*0.22;
		System.out.print("precioPagar:"+precioPagar);
	}
}