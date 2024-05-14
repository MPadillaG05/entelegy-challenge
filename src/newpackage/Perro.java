
package newpackage;

public class Perro extends Animal{
    Perro(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Perro");
    }

    @Override
    void realizarSonido() {
        System.out.println("Ladra");
    }
}
