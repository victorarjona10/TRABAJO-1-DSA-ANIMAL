import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Zoo {
    private String nom;
    private String ciutat;
    private List<Animal> animals; //aggregation
    public Zoo(String nom, String ciutat){  //constructor de Zoo
        this.nom = nom;
        this.ciutat = ciutat;
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
    public void horaDeDormir(){
        for(int i = 0; i < this.animals.size(); i++){
            this.animals.get(i).dormir();
        }
    }
    public void displayData(){
        System.out.println("Nom del Zoo: " + this.nom + ". Ciutat: " + this.ciutat + ". Animals del Zoo:");
        for(int i = 0; i < this.animals.size(); i++){
            this.animals.get(i).displayData();
        }

    }

}
