
public class Circulo extends figura {
    double radio;

    Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    double area() {
        return 3.14159 * radio * radio;
    }
}
