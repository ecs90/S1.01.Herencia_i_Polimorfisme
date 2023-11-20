package n1exercici1;

public abstract class Instruments {
	String	nom;
	float	preu;
	
	{
		System.out.println("Bloque de inicialización");
	}

	static{
		System.out.println("Bloque estático (esto debería mostrarse primero)");
	}
	abstract void tocar();
}
