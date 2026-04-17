package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingletonTest {
  public static void main(String[] args) throws InterruptedException {
    // Test basic singleton
    SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
    SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();
    if (s1 == s2) {
      System.out.println("Singleton works: same instance");
    } else {
      System.out.println("Singleton failed: different instances");
    }

    // Test thread safety
    ExecutorService executor = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 10; i++) {
      executor.submit(
          () -> {
            SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
            System.out.println("Instance hash: " + instance.hashCode());
          });
    }
    executor.shutdown();
    executor.awaitTermination(1, TimeUnit.MINUTES);

    System.out.println("Thread safety test completed. All instances should have the same hash.");
  }
}
