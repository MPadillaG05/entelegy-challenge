
package newpackage;

public class Gato extends Animal{
    Gato(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Gato");
    }

    @Override
    void realizarSonido() {
        System.out.println("Maulla");
    }
}
