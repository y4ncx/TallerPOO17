package Ejemplos.EjemploSistemaAnimales;


public class Main {
    public static void main(String[] args) {
        Animal miPato = new Pato();
        Animal miPerro = new Perro();
        miPato.hacerSonido(); // Muestra: "El pato hace cuac cuac."
        miPerro.hacerSonido(); // Muestra: "El perro ladra."
    }
}