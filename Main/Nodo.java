package Main;
public class Nodo {
    int año, edad;
    String nombre;
    Nodo Hijoizquierdo, Hijoderecho;

    public Nodo(int año, String nombre) {
        this.año = año;
        this.edad = (2020 - año);
        this.nombre = nombre;
        this.Hijoizquierdo = null;
        this.Hijoderecho = null;
    }

    @Override
    public String toString() {
        return "[Nombre: " + nombre + " edad: " + edad + " año:" +  año + "]";
    }

}  
