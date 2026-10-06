// Nombre : Sebastián Ortega Barrero - Ficha: 3292136

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais", 3, "Criollo"));
        animales.add(new Gato("Michi", 2, true));
        animales.add(new Vaca("Lola", 5));

        for (Animal a : animales) {
            a.mostrarInfo();
            System.out.println(a.getNombre() + " dice: " + a.hacerSonido());
        }
    }
}

/*
 * ¿Dónde se aplico cada pilar?
 * 
 * 1. Encapsulamiento: en la clase Animal, nombre y edad son private.
 * setEdad() no deja poner edades negativas y no hay setNombre(),
 * así que desde fuera nadie puede romper esos datos.
 * 
 * 2. Herencia: Perro y Gato extienden Animal. Reutilizan nombre, edad
 * y mostrarInfo() sin repetirlos; solo agregan raza e interior.
 * 
 * 3. Polimorfismo: guardo perros, gatos y vacas en una sola List<Animal>
 * y un solo for llama a mostrarInfo() y hacerSonido(). Cada objeto
 * responde según su clase.
 * 
 * 4. Abstracción: Animal es abstract y hacerSonido() es abstracto, por
 * eso no se puede hacer new Animal() y cada hija está obligada a
 * definir su sonido.
 */