public class Application {
    public static void main(String[] args) {
        Category mammals = CategoryFactory.createCategory(CategoryCode.MAMMALS);
        System.out.println(mammals);

        Category fishes = CategoryFactory.createCategory(CategoryCode.FISHES);
        System.out.println(fishes);
    }
}
