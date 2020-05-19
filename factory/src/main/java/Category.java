import java.util.ArrayList;
import java.util.List;

public abstract class Category {
    Category(){
        addAnimal();            // ...
    }
    List<Animal> animals = new ArrayList<Animal>();

    abstract List<Animal> addAnimal();          // to create new new groups .........
}
