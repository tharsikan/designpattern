import java.util.List;

public class Fishes extends Category{
    @Override
    List<Animal> addAnimal() {
        animals.add(new Shark());
        animals.add(new Seahorse());
        return animals;
    }
    @Override
    public String toString() {
        return ""+animals;
    }
}
