package n1exercici1;

public abstract class Instruments {
	private String	nom;
	private float	preu;
	
	{
		System.out.println("Bloque de inicialización");
	}

	static{
		System.out.println("Bloque estático (esto debería mostrarse primero)");
	}
	protected abstract void tocar();
}
