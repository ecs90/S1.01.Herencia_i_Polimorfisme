package n3exercici1;

public class Motociclisme extends Noticia
{
    String  equip;

    @Override
    void calcularPreuNoticia() {
        setPreu(100);
        setPuntuacio(3);
        if (this.equip.equals("Honda") || this.equip.equals("Yamaha")) {
            this.preu += 50;
            this.puntuacio += 3;
        }
    }
}
