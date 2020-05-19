import java.util.List;

public class Birds extends Category {
    @Override
    List<Animal> addAnimal() {
        animals.add(new Owl());
        return animals;
    }
    @Override
    public String toString() {
        return ""+animals;
    }
}
