package newpackage;


class Reporte {
    static Animal[] cargarDatos() {
        Animal[] animales = new Animal[9];
      
        animales[0] = new Perro("Bobi", 5, "Raza1", 15);
        animales[1] = new Perro("Luna", 3, "Raza2", 12);
        animales[2] = new Perro("Laia", 7, "Raza3", 10);
        animales[3] = new Gato("Milo", 4, "Raza4", 18);
        animales[4] = new Gato("Bella", 2, "Raza5", 16);
        animales[5] = new Gato("Zeus", 6, "Raza6", 14);
        animales[6] = new Vaca("Argos", 8, "Raza7", 20);
        animales[7] = new Vaca("Manchas", 5, "Raza8", 18);
        animales[8] = new Vaca("Laica", 10, "Raza9", 15);
        return animales;
    }


    public static void main(String[] args) {
 
        Animal[] animales = cargarDatos();

        try {
            animales[0].describir();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Animal no encontrado");
        }
    }
}
