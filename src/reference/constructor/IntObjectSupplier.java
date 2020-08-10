package reference.constructor;

@FunctionalInterface
public interface IntObjectSupplier {
    ObjIntCreation apply(ObjIntCreation obj);
}