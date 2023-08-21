public class Rectangulo extends figura {
    double ancho, alto;

    Rectangulo(String color, double ancho, double alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }

    double area() {
        return ancho * alto;
    }
}
