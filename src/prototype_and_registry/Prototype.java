package prototype_and_registry;

public interface Prototype<T> {
  T getClone();
}
