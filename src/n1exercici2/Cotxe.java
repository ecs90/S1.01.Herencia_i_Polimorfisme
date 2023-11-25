package n1exercici2;

public class Cotxe {
	private static final String 	marca = "VW";
	private static String 			model;
	private final int 				potencia;
	
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
	
	protected static void frenar()
	{
		System.out.println("El vehicle esta frenant");
	}
	
	protected void accelerar()
	{
		System.out.println("El vehicle esta accelerant");
	}
}
