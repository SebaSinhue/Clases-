package tarea4.POO_2257;

public class gatoDriver {
    public static void main(String[] args){
        gato Cat = new gato("Carlitos", "Bengala");
        System.out.println(Cat.getNombre());
        System.out.println(Cat.getEspecie());
        System.out.println(Cat.comer());
        System.out.println(Cat.dormir());
        System.out.println(Cat.araniar());
    }

}
