
package newpackage;

public class Vaca extends Animal{
     Vaca(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Vaca");
    }

    @Override
    void realizarSonido() {
        System.out.println("Muge");
    }
}
