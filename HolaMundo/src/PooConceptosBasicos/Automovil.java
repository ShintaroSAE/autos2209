package PooConceptosBasicos;
import java.awt.Color;
/**
 * @author Eduardo Salazar
 */

public class Automovil {
    private String marca;
    private String subMarca;
    private int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String submarca, int modelo, Color color) {
        this.marca = marca;
        this.subMarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return subMarca;
    }

    public void setSubmarca(String submarca) {
        this.subMarca = submarca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void encender(){
        System.out.println("El auto " + this.subMarca + " esta encendido.");
    }
    
    public void acelerar(){
        System.out.println("Acelerando el auto " + this.subMarca );
    }
    
    public void avanzar(){
        System.out.println("Avanzando el auto");
    }
}
