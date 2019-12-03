import java.util.ArrayList;
public class Home {

    private ArrayList<animals> animal;

    public Home(){

        animal = new ArrayList<>();
    }

    public void adoptPet(animals animal1){

        animal.add(animal1);
    }
    public void makeAllSounds(){

        for(animals pet: animal){

            pet.sound();
        }
        System.out.println();
    }
}
