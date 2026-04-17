package singleton;

/**
 * In the double-checked locking pattern, volatile guarantees that when one thread initializes
 * instance inside the synchronized block, other threads will see the updated value immediately when
 * they check if (instance == null) outside the block.
 *
 * <p>Without volatile, a thread might read a partially constructed object or a null value due to
 * caching, leading to thread-safety issues (e.g., multiple instances could be created).
 *
 * <p>This makes the singleton thread-safe and efficient, as synchronization is only used when
 * necessary.
 */
public class SingletonDesignPattern {

  private static volatile SingletonDesignPattern instance = null;

  private SingletonDesignPattern() {}

  public static SingletonDesignPattern getInstance() {
    if (instance == null) {
      // double checking
      synchronized (SingletonDesignPattern.class) {
        if (instance == null) {
          instance = new SingletonDesignPattern();
        }
      }
    }
    return instance;
  }
}
