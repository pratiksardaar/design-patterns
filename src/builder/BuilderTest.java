package builder;

/** Test class demonstrating the usage of BuilderDesignPattern with the Builder pattern. */
public class BuilderTest {

  public static void main(String[] args) {
    // Example 1: Building with all fields
    BuilderDesignPattern person1 =
        BuilderDesignPattern.builder().name("John Doe").age(30).contact(9876543210L).build();

    System.out.println("Person 1:");
    System.out.println("  Name: " + person1.getName());
    System.out.println("  Age: " + person1.getAge());
    System.out.println("  Contact: " + person1.getContact());

    // Example 2: Building with partial fields
    BuilderDesignPattern person2 =
        BuilderDesignPattern.builder().name("Jane Smith").age(25).build();

    System.out.println("\nPerson 2:");
    System.out.println("  Name: " + person2.getName());
    System.out.println("  Age: " + person2.getAge());
    System.out.println("  Contact: " + person2.getContact());

    System.out.println(
        "\n✓ Builder pattern successfully demonstrates step-by-step object construction");
  }
}
