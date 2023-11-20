package n3exercici1;

public class Redactor {
	String			nom;
	final String	dni;
	static int		sou = 1500;

	public Redactor(String nom, String dni) {
		super();
		this.nom = nom;
		this.dni = dni;
	}

	public String getNom() 
	{
		return nom;
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public static int getSou() 
	{
		return sou;
	}

	public static void setSou(int sou) 
	{
		Redactor.sou = sou;
	}

	public String getDni() 
	{
		return dni;
	}
	
	
}
