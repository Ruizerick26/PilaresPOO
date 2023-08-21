public class Coche extends Vehiculo{
    Coche(String marca) {
        super(marca);
    }

    void hacerSonarBocina() {
        System.out.println("¡Beep beep!");
    }
}
