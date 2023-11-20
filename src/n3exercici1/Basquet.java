package n3exercici1;

public class Basquet extends Noticia
{
    String  competicio;
    String  club;

    @Override
    void calcularPreuNoticia() {
        setPreu(250);
        setPuntuacio(4);
        if (this.competicio.equals("Eurolliga"))
        {
            this.preu += 75;
            this.puntuacio += 3;
        } else if (this.competicio.equals("ACB"))
            this.puntuacio += 2;
        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            this.preu += 75;
            this.puntuacio += 1;
        }
    }
}
