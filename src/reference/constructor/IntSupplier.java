package reference.constructor;

@FunctionalInterface
public interface IntSupplier {
    ObjIntCreation apply(int n);
}