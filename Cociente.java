import java.util.Scanner;

/**
 * Esta clase contiene la división de a calculadora.
 * @author Pablo Beitia Mateos
 * @version 2.0
 * @since 24/02/2021
 */
public class Cociente extends Principal{
	static Scanner leer = new Scanner(System.in);
	
	/**
	 *<h1>Método que divide dos números enteros y devuelve el resultado de la división.</h1>
	 * 
	 *Casos Especiales:
	 * 	<ul>
	 * 		<li>Si el dividendo es 0 el resultado de la división es 0.</li>
	 * 		<li>Si el divisor es 0, la división dará error porque no se puede dividir entre 0.</li>
	 *		<li>Si el dividendo o divisor es negativo dará error la calculadora.</li>
	 *		<li>Si la división no da un número exacto, se muestra el número real que haya salido.</li>
	 *	</ul>
	 *
	 * @param divisor Número real que actuará como divisor en la división.
	 * @param dividendo Número real que actuará como dividendo en la división.
	 * @param resultado Resultado final de la división entre los dos números
	 * @return Devuelve el resultado de la división.
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
	 *<h1>Método que divide dos números enteros y devuelve el resultado de la división.</h1>
	 * 
	 *Casos Especiales:
	 * 	<ul>
	 * 		<li>Si el dividendo es 0 el resultado de la división es 0.</li>
	 * 		<li>Si el divisor es 0, la división dará error porque no se puede dividir entre 0.</li>
	 *		<li>Si el dividendo o divisor es negativo dará error la calculadora.</li>
	 *		<li>Si la división no da un número exacto, se muestra el número sin decimales.</li>
	 *	</ul>
	 *
	 * @param divisor Número entero que actuará como divisor en la división.
	 * @param dividendo Número entero que actuará como dividendo en la división.
	 * @param resultado Resultado final de la división entre los dos números.
	 * @return Devuelve el resultado de la división.
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
	 *<h1>Método que hace el inverso de un número y devuelve la solución.</h1>
	 *
	 *Casos Especiales:
	 * 	<ul>
	 * 		<li>Si el número es 0, el resultado del inverso dará error.</li>
	 *		<li>Si el número es negativo, la calculadora funcionará y mostrará el resultado.</li>
	 *		<li>Si el número contiene decimales, se hará el inverso de dicho número.</li>
	 *	</ul>
	 *
	 * @param numeroReal  Número real que se usará para calcular su inverso.
	 * @param resultado Resultado del inverso del número real.
	 * @return Devuelve el resultado del inverso de un número.
	 */
	public static double CocienteTipoTres() {
		double resultado = 0;
		System.out.println("Introduce un número para sacar su inverso: ");
		double numeroReal = leer.nextDouble();
		resultado = 1/numeroReal;
		return resultado;
	}
	
	/**
	 *<h1>Método que hace la raíz cuadrada de un número y muestra su resultado</h1>
	 *
	 *Casos Especiales:
	 * 	<ul>
	 *		<li>Si el número es negativo, la raíz cuadrada dará error.</li>
	 *		<li>Si el número contiene decimales, se hará la raí< cuadrada de dicho número.</li>
	 *		<li>Si el número es 0, el resultado será 0.</li>
	 *	</ul>
	 *
	 * @param raiz Número real que se usará para calcular su raiz cuadrada.
	 * @param resultado Número real que mostrará la raiz cuadrada del número tecleado.
	 * @return Devuelve la raiz cuadrada de un número.
	 */
	public static double CocienteTipoCuatro() {
		double resultado = 0;
		System.out.println("Introduce un número para sacar su raíz: ");
		double raiz = leer.nextDouble();
		resultado = Math.sqrt(raiz);
		return resultado;
	}
}
