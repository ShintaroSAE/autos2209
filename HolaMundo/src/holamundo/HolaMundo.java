package holamundo;
import PooConceptosBasicos.Automovil;
import java.awt.Color;
/**
 * @author Eduardo Salazar
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Java!!!!");
        
        Persona per1 = new Persona();
        per1.setNombre("Eduardo SA ");
        System.out.println("Nombre per 1: " + per1.getNombre());
        per1.comer("Hamburguesa");
        
        Persona per2 = new Persona();
        per2.setNombre("Felipe ");
        System.out.println("Nombre per 2: " + per2.getNombre());
        per2.comer("Pizza Hawaiana");       
        
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VM");
        System.out.println("Marca: " + miBocho.getMarca());
        miBocho.setSubmarca("Sedan");
        System.out.println("Submarca: " + miBocho.getSubmarca());
        miBocho.setModelo(1970);
        System.out.println("Modelo: " + miBocho.getModelo());
        miBocho.setColor(Color.BLUE);
        System.out.println("Color: " + miBocho.getColor());
        
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        System.out.println("Marca: " + miAkura.getMarca());
        miAkura.setSubmarca("NSX");
        System.out.println("Submarca: " + miAkura.getSubmarca());
        miAkura.setModelo(2013);
        System.out.println("Modelo: " + miAkura.getModelo());
        miAkura.setColor(Color.GRAY);
        System.out.println("Color: " + miAkura.getColor());
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        System.out.println("Marca: " + miMustang.getMarca());
        miMustang.setSubmarca("Mustang");
        System.out.println("Submarca: " + miMustang.getSubmarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo: " + miMustang.getModelo());
        miMustang.setColor(Color.YELLOW);
        System.out.println("Color: " + miMustang.getColor());
    }
}
