public class Persona {
    // Atributos privados (encapsulados)
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Juan", 30);

        // Usar los métodos para acceder y modificar los atributos privados
        System.out.println("Nombre: " + persona.getNombre());  // Salida: Juan
        System.out.println("Edad: " + persona.getEdad());      // Salida: 30

        persona.setEdad(35);
        persona.imprimirInformacion();
    }
}

