package tarea4.POO_2257;

public class perroDriver {
    public static void main(String[] args){
     perro Dog = new perro("Doberman", "Juanito");
        System.out.println(Dog.getNombre());
        System.out.println(Dog.getEspecie());
        System.out.println(Dog.ladrar());
        System.out.println(Dog.hacerDelBanio());
    }
}
