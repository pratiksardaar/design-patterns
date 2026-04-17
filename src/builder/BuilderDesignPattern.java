package builder;

/**
 * BuilderDesignPattern demonstrates the Builder design pattern. This pattern allows constructing
 * complex objects step-by-step with a fluent interface while maintaining immutability.
 */
public class BuilderDesignPattern {

  private final String name;
  private final int age;
  private final Number contact;

  private BuilderDesignPattern(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.contact = builder.contact;
  }

  public static Builder builder() {
    return new Builder();
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Number getContact() {
    return contact;
  }

  /**
   * Static inner Builder class for constructing BuilderDesignPattern instances using the fluent
   * builder pattern.
   */
  public static class Builder {

    private String name;
    private int age;
    private Number contact;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder contact(Number contact) {
      this.contact = contact;
      return this;
    }

    /**
     * Builds and returns the BuilderDesignPattern instance with the configured values.
     *
     * @return a new BuilderDesignPattern instance
     */
    public BuilderDesignPattern build() {
      return new BuilderDesignPattern(this);
    }
  }
}
