package abstract_factory;

public class Main {

    private static void createFurniture(FurnitureFactory factory) {
        Chair chair = factory.createChair();
        Couch couch = factory.createCouch();
        System.out.println(chair);
        System.out.println(couch);
    }

    public static void main(String [] args) {
        createFurniture(NormalFurnitureFactory.instance());
        createFurniture(FuzzyFurnitureFactory.instance());
    }
}
