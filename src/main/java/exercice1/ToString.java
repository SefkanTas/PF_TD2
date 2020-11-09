package exercice1;

@FunctionalInterface
public interface ToString<T> {
    public String convert(T val);
}
