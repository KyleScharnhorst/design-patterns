package abstract_factory;

public abstract class FurnitureFactory {
    // Concrete factory classes should be Singletons

    public abstract Chair createChair();
    public abstract Couch createCouch();
}
