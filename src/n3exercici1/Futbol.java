package n3exercici1;

public class Futbol extends Noticia
{
    String  competicio;
    String  club;
    String  jugador;

    @Override
    void calcularPreuNoticia() {
        setPreu(300);
        setPuntuacio(5);
        if (this.competicio == "Campions") {
            this.preu += 100;
            this.puntuacio += 3;
        } else if (this.competicio == "Lliga")
            this.puntuacio += 2;
        if (this.club.equals("Barça") || this.club.equals("Madrid")) {
            this.preu += 100;
            this.puntuacio += 1;
        }
        if (this.club.equals("Ferran Torres") || this.club.equals("Benzema")) {
            this.preu += 50;
            this.puntuacio += 1;
        }
    }
}
