//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {//String pais, String sonido, int edad,String nombre,int chip
        Animal perro = new Domestico("Suiza","ghhhu",10,"Perro",123124123);
        Animal dinosaurio = new Salvaje("Pangea","miau",54732199,"Ankylosaurus","Savana");
        Zoo zoo = new Zoo("Zoo_Pangea","Barcelona");
        zoo.addAnimal(dinosaurio);
        zoo.addAnimal(perro);
        zoo.displayData();
        zoo.horaDeDormir();

       //Animal("España","guau",11);
       // p.setNombre("paco");
       // p.displayData();
       // Animal c = new Salvaje();
       // c.setNombre("jaime");
       // c.displayData();


    }
}