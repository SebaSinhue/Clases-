package tarea4.POO_2257;

import java.awt.*;

public class perro {
    private String especie;
    private float tamanio;
    private String nombre;
    private byte edad;
    private Color color;

    public perro(String especie, float tamanio, String nombre, byte edad, Color color) {
        this.especie = especie;
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    public perro(String especie, String nombre) {
        this.especie = especie;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if (edad > 0 && edad <=13){
            this.edad = edad;
        } else{
            System.out.println("Esta edad es incompatible");
        }
    }

    @Override
    public String toString() {
        return "perro{" +
                "especie='" + especie + '\'' +
                ", tamanio=" + tamanio +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color=" + color +
                '}';
    }
    public boolean ladrar(){
        System.out.println("¿El perro ladro?...");
        boolean resultado = Math.random() > 0.51;
        return resultado;
    }
    public boolean hacerDelBanio(){
        System.out.println("¿El perro hizo del banio?...");
        boolean resultado = Math.random() > 0.51;
        return resultado;
    }

}
