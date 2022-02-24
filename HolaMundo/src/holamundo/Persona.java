package holamundo;
/**
 *
 * @author Eduardo Salazar
 */
public class Persona {
    String nombre;
    int edad;

    //metodo constructor
    public Persona() {
    }
    //metodo constructor sobrecargado
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //metodos de uso general
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(String Platillo){
        System.out.println(this.nombre + "está comiendo "+ Platillo );
    }
    
}
