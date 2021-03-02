package operacion.cociente;

import java.util.Scanner;

import operacion.main.Pruebas;

/**
 * Esta clase contiene la divisi�n de a calculadora.
 * @author Pablo Beitia Mateos
 * @version 1.0
 * @since 24/02/2021
 */
public class Cociente extends Pruebas{
	static Scanner leer = new Scanner(System.in);
	
	/**
	 *<h1>M�todo que divide dos n�meros enteros y devuelve el resultado de la divisi�n.</h1>
	 * 
	 *Casos Especiales:
	 * 	<ul>
	 * 		<li>Si el dividendo es 0 el resultado de la divisi�n es 0.</li>
	 * 		<li>Si el divisor es 0, la divisi�n dar� error porque no se puede dividir entre 0.</li>
	 *		<li>Si el dividendo o divisor es negativo dar� error la calculadora.</li>
	 *		<li>Si la divisi�n no da un n�mero exacto, se muestra el n�mero real que haya salido.</li>
	 *	</ul>
	 *
	 * @param divisor N�mero real que actuar� como divisor en la divisi�n.
	 * @param dividendo N�mero real que actuar� como dividendo en la divisi�n.
	 * @param resultado Resultado final de la divisi�n entre los dos n�meros
	 * @return Devuelve el resultado de la divisi�n.
	 */
	public static double CocienteTipoUno() {
		double resultado = 0;
		System.out.println("Introduce el dividendo: ");
		double dividendo = leer.nextDouble();
		System.out.println("Introduce el divisor: ");
		double divisor = leer.nextDouble();
		resultado = dividendo/divisor;
		return resultado;
	}
	
	/**
	 *<h1>M�todo que divide dos n�meros enteros y devuelve el resultado de la divisi�n.</h1>
	 * 
	 *Casos Especiales:
	 * 	<ul>
	 * 		<li>Si el dividendo es 0 el resultado de la divisi�n es 0.</li>
	 * 		<li>Si el divisor es 0, la divisi�n dar� error porque no se puede dividir entre 0.</li>
	 *		<li>Si el dividendo o divisor es negativo dar� error la calculadora.</li>
	 *		<li>Si la divisi�n no da un n�mero exacto, se muestra el n�mero sin decimales.</li>
	 *	</ul>
	 *
	 * @param divisor N�mero entero que actuar� como divisor en la divisi�n.
	 * @param dividendo N�mero entero que actuar� como dividendo en la divisi�n.
	 * @param resultado Resultado final de la divisi�n entre los dos n�meros.
	 * @return Devuelve el resultado de la divisi�n.
	 */
	public static double CocienteTipoDos() {
		int resultado = 0;
		System.out.println("Introduce el dividendo: ");
		int dividendo = leer.nextInt();
		System.out.println("Introduce el divisor: ");
		int divisor = leer.nextInt();
		resultado = dividendo/divisor;
		return resultado;
	}
	
	/**
	 *<h1>M�todo que hace el inverso de un n�mero y devuelve la soluci�n.</h1>
	 *
	 *Casos Especiales:
	 * 	<ul>
	 * 		<li>Si el n�mero es 0, el resultado del inverso dar� error.</li>
	 *		<li>Si el n�mero es negativo, la calculadora funcionar� y mostrar� el resultado.</li>
	 *		<li>Si el n�mero contiene decimales, se har� el inverso de dicho n�mero.</li>
	 *	</ul>
	 *
	 * @param numeroReal  N�mero real que se usar� para calcular su inverso.
	 * @param resultado Resultado del inverso del n�mero real.
	 * @return Devuelve el resultado del inverso de un n�mero.
	 */
	public static double CocienteTipoTres() {
		double resultado = 0;
		System.out.println("Introduce un n�mero para sacar su inverso: ");
		double numeroReal = leer.nextDouble();
		resultado = 1/numeroReal;
		return resultado;
	}
	
	/**
	 *<h1>M�todo que hace la ra�z cuadrada de un n�mero y muestra su resultado</h1>
	 *
	 *Casos Especiales:
	 * 	<ul>
	 *		<li>Si el n�mero es negativo, la ra�z cuadrada dar� error.</li>
	 *		<li>Si el n�mero contiene decimales, se har� la ra�< cuadrada de dicho n�mero.</li>
	 *		<li>Si el n�mero es 0, el resultado ser� 0.</li>
	 *	</ul>
	 *
	 * @param raiz N�mero real que se usar� para calcular su raiz cuadrada.
	 * @param resultado N�mero real que mostrar� la raiz cuadrada del n�mero tecleado.
	 * @return Devuelve la raiz cuadrada de un n�mero.
	 */
	public static double CocienteTipoCuatro() {
		double resultado = 0;
		System.out.println("Introduce un n�mero para sacar su ra�z: ");
		double raiz = leer.nextDouble();
		resultado = Math.sqrt(raiz);
		return resultado;
	}
}
