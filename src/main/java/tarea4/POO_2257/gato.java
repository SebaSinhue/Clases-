package tarea4.POO_2257;
import java.awt.*;

public class gato {
    private String nombre;
    private String especie;
    private byte edad;
    private Color color;
    private int tamanio;

    public gato() {
    }

    public gato(String nombre, String especie, byte edad, Color color, int tamanio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.color = color;
        this.tamanio = tamanio;
    }

    public gato(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "gato{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", color=" + color +
                ", tamanio=" + tamanio +
                '}';
    }
    public boolean comer(){
        System.out.println("¿El gato esta comiendo?...");
        boolean resultado = Math.random() >0.3;
        return resultado;
    }
    public boolean dormir(){
        System.out.println("¿El gato durmio?...");
        boolean resultado = Math.random() >0.50;
        return resultado;
    }
    public boolean araniar(){
        System.out.println("¿El gato aranio?...");
        boolean resultado = Math.random() >0.11;
        return resultado;
    }
}
