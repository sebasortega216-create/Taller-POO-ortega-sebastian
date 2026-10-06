public class Vaca extends Animal {
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "¡Muuu!";
    }
}
