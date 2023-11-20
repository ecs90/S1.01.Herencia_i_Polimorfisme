package n2exercici1;

/*
 * Crea una classe anomenada "Tel�fon" amb els atributs marca i model, i el m�tode trucar(). 
 * Aquest m�tode ha de rebre un String amb un n�mero de tel�fon. 
 * El m�tode ha de mostrar per consola un missatge dient que s�est� trucant al n�mero rebut per par�metre. 
 * Crea una interf�cie anomenada "Camera" amb el m�tode fotografiar(), 
 * i una altra interf�cie anomenada Rellotge amb el m�tode alarma().
 * Crea una classe anomenada "Smartphone" que sigui subclasse de "Tel�fon" i que a la vegada implementi 
 * les interf�cies "Camera" i "Rellotge".
 * El m�tode fotografiar() ha de mostrar per consola: �S�est� fent una foto� i el m�tode alarma() ha de mostrar: 
 * �Est� sonant l�alarma�.
 * Des del main() de l�aplicaci�, crea un objecte Smartphone i crida als m�todes anteriors.
 * */

public class Telefon {
	String	marca;
	String	model;
	
	
	
	public Telefon(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}

	void trucar(String numero)
	{
		System.out.println("s�est� trucant al n�mero " + numero);
	}
}
