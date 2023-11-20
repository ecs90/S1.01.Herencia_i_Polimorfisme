package n1exercici1;

public class Main {
	public static void main(String[] args) {
		Corda		guitarra = new Corda();
		Vent		flauta = new Vent();
		Percussio	pandereta = new Percussio();

		guitarra.tocar();
		flauta.tocar();
		pandereta.tocar();

		System.out.println("Esto deberia salir ultimo");
	}
}
