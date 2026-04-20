package prototype_and_registry;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student implements Prototype<Student> {

  private String name;
  private int age;
  private int psp;
  private String batch;
  private String course;

  public Student() {}

  public Student(Student student) {
    this.name = student.name;
    this.age = student.age;
    this.psp = student.psp;
    this.batch = student.batch;
    this.course = student.course;
  }

  @Override
  public Student getClone() {
    return new Student(this);
  }
}
