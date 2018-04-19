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
		double precioSinOfe=10;
		double precioPagar= precioSinOfe - precioSinOfe*0.22;
		System.out.print("precioPagar:"+precioPagar);
	}
}