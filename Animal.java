
abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Edad inválida: no puede ser negativa.");
            return;
        }
        this.edad = edad;
    }

    protected String describir() {
        return "Nombre: " + nombre + " | Edad: " + edad;
    }

    public void mostrarInfo() {
        System.out.println(describir());
    }

    public abstract String hacerSonido();
}