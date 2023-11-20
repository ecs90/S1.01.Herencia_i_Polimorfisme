package n3exercici1;

public class F1 extends Noticia
{
    String  escuderia;

    @Override
    void calcularPreuNoticia() {
        setPreu(100);
        setPuntuacio(4);
        if (this.escuderia.equals("Ferrari") || this.escuderia.equals("Mercedes")) {
            this.preu += 50;
            this.puntuacio += 2;
        }
    }
}
