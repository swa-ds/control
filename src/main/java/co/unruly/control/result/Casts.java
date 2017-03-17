package co.unruly.control.result;

public class Casts {

    /**
     * Attempts to cast a value to a given subclass. If the provided value is an instance of the
     * subclass, returns a Success of that value (typed to the subclass). If it isn't, returns
     * a Failure of that value.
     */
    @SuppressWarnings("unchecked")
    public static <T, S extends T> Result<S, T> cast(T t, Class<S> subclass) {
        return subclass.isAssignableFrom(t.getClass()) ? Result.success((S)t) : Result.failure(t);
    }

}