public class Perro extends Animal {
     private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    protected String describir() {
        return super.describir() + " | Raza: " + raza;
    }

    @Override
    public String hacerSonido() {
        return "¡Guau!";
    }
}

