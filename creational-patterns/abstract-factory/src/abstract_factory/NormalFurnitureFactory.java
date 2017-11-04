package abstract_factory;

public class NormalFurnitureFactory extends FurnitureFactory {
    private static NormalFurnitureFactory _factory = null;

    private NormalFurnitureFactory() {}

    public static FurnitureFactory instance() {
        if(_factory == null) {
            _factory = new NormalFurnitureFactory();
        }
        return _factory;
    }

    @Override
    public Chair createChair() {
        return new Chair();
    }

    @Override
    public Couch createCouch() {
        return new Couch();
    }
}
