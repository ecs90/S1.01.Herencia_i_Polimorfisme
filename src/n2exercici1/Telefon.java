package n2exercici1;

public class Telefon {
	private String	marca;
	private String	model;
	
	
	
	public Telefon(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}

	protected void trucar(String numero)
	{
		System.out.println("s'esta trucant al numero " + numero);
	}
}
