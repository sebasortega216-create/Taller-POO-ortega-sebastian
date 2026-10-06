 public class Gato extends Animal {
    private boolean interior;

    public Gato(String nombre, int edad, boolean interior) {
        super(nombre, edad);
        this.interior = interior;
    }

    @Override
    protected String describir() {
        return super.describir() + " | Interior: " + (interior ? "sí" : "no");
    }

    @Override
    public String hacerSonido() {
        return "¡Miau!";
    }
}

