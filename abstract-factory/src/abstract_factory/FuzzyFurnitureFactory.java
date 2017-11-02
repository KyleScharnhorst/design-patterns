package abstract_factory;

public class FuzzyFurnitureFactory extends FurnitureFactory {
    private static FuzzyFurnitureFactory _factory = null;

    private FuzzyFurnitureFactory() {}

    public static FurnitureFactory instance() {
        if(_factory == null) {
            _factory = new FuzzyFurnitureFactory();
        }
        return _factory;
    }

    @Override
    public Chair createChair() {
        return new FuzzyChair();
    }

    @Override
    public Couch createCouch() {
        return new FuzzyCouch();
    }
}
