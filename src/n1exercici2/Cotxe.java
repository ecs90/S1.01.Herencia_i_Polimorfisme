package n1exercici2;

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
		System.out.println("El vehicle esta frenant");
	}
	
	void accelerar()
	{
		System.out.println("El vehicle esta accelerant");
	}
}
