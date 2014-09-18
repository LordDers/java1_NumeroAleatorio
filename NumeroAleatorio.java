public class NumeroAleatorio 
{
	static int numero;
	public static void main(String args[]) // Obligatorio para poder ejecutar codigo Java
	{

		numero = (int) (Math.random() *20) + 1; // Numero aleatorio hasta el 20
		System.out.print(numero);
		System.out.println(""); // Imprime en blanco y salta de linea
	}
}
