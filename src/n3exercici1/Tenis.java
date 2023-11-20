package n3exercici1;

public class Tenis extends Noticia
{
    String  competicio;
    String  tenista;

    @Override
    void calcularPreuNoticia() {
        setPreu(150);
        setPuntuacio(4);
        if (this.tenista.equals("Federer") || this.tenista.equals("Nadal") || this.tenista.equals("Djokovic")) {
            this.preu += 100;
            this.puntuacio += 3;
        }
    }
}
