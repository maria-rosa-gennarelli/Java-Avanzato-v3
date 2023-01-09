public class GenericsClass<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <T> boolean isEqual(GenericsClass<T>gc1, GenericsClass<T>gc2){
        boolean isequals = gc1.getT().equals(gc2.getT());
        return isequals;
    }
}
