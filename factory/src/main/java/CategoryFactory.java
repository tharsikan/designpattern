public class CategoryFactory {
    public static Category createCategory(CategoryCode categoryCode){
        switch(categoryCode){
            case MAMMALS:
                return new Mammals();

            case FISHES:
                return new Fishes();

            case BIRDS:
                return new Birds();

            default:
                return null;
        }
    }
}
