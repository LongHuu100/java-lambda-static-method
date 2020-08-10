package parameter.method.reference;

import instance.methods.object.IntNumChecker;

@FunctionalInterface
public interface IntNumPredicate {
    boolean check(IntNumChecker m, int n);
}
