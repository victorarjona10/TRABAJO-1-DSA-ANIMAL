public class Main {
   public static void main(String[] args) {
        Animal perro = new Domestico("Suiza","ghhhu",10,"Perro",123124123);
        Animal dinosaurio = new Salvaje("Pangea","miau",54732199,"Ankylosaurus","Savana");

        Zoo zoo = new Zoo("Zoo_Pangea","Barcelona");
        zoo.addAnimal(dinosaurio);
        zoo.addAnimal(perro);

        zoo.displayData();
        zoo.horaDeDormir();
    }
}