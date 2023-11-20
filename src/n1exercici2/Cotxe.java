package n1exercici2;

/*
 * Crea una classe "Cotxe" amb els atributs: marca, model i pot�ncia. 
 * La marca ha de ser est�tic final, el model est�tic i la pot�ncia final. 
 * Demostra la difer�ncia entre els tres. N�hi ha algun que es pugui inicialitzar al constructor de la classe?
 * Afegeix dos m�todes a la classe "Cotxe". 
 * Un m�tode est�tic anomenat frenar() i un altre no est�tic anomenat accelerar(). 
 * El m�tode accelerar ha de mostrar per consola: �El vehicle est� accelerant� i el m�tode frenar() ha de mostrar: 
 * �El vehicle est� frenant�. 
 * Demostra com invocar el m�tode est�tic i el no est�tic des del main() de la classe principal.
 * */

/*
 * Atributo Est�tico:
 * La variable es �nica para todas las instancias (objetos) de la clase (ocupa un �nico lugar en memoria).
 * Si no se usa static, el sistema crea un lugar nuevo para esa variable con cada instancia 
 * (la variable es diferente para cada objeto).
 * La declaraci�n de la constante ha de realizarse obligatoriamente en cabecera de la clase
 * Si tratamos de incorporarlo en un metodo obtendremos un error.
 * */

/*
 * Metodo Est�tico:
 * Est�n asociados a una clase, pero no a instancias espec�ficas de esa clase. 
 * Estos m�todos no requieren un objeto de la clase como argumento de entrada. 
 * Por lo tanto, puede llamarlos sin crear un objeto de la clase.
 * */

/*
 * Atributo Final:
 * Indica que una variable es de tipo constante: no admitir� cambios despu�s de su declaraci�n y asignaci�n de valor.
 * Ha de ser inicializada en el mismo momento de declararla.
 * Una clase final (final) es aquella que no puede tener clases que la hereden.
 * */

public class Cotxe {
	static final String 	marca = "VW";
	static String 			model;
	final int 				potencia;
	
	public Cotxe(int potencia) {
		super();
		this.potencia = potencia;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return marca;
	}

	public int getPotencia() {
		return potencia;
	}
	
	static void frenar() 
	{
		System.out.println("El vehicle est� frenant");
	}
	
	void accelerar()
	{
		System.out.println("El vehicle est� accelerant");
	}
}
