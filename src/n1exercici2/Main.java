package n1exercici2;

public class Main {
	public static void main(String[] args) 
	{
		Cotxe coche = new Cotxe(100);
		
		coche.setModel("Golf");
		
		coche.accelerar();
		Cotxe.frenar();
	}
}
