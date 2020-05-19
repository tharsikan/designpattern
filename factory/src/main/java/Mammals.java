import java.util.List;

public class Mammals extends Category {
    @Override
    List<Animal> addAnimal() {
        animals.add(new Cat());
        animals.add(new Dog());
        return animals;
    }

    @Override
    public String toString() {
        return ""+animals;
    }
}
