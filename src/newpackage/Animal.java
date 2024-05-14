
package newpackage;


abstract class Animal {
     String nombre;
    int edad;
    String raza;
    int tiempoDeVida;
    String tipo;

    Animal(String nombre, int edad, String raza, int tiempoDeVida, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoDeVida = tiempoDeVida;
        this.tipo = tipo;
    }
    
    abstract void realizarSonido();

    void describir() {
        
        System.out.print(nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad + " de edad. "
                + "Siempre ");
        realizarSonido();
        System.out.println( "cuando está feliz. Su expectativa de vida es de " + tiempoDeVida + " años.");
        
    }
}
