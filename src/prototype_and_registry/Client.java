package prototype_and_registry;

public class Client {

  public static void main(String[] args) {

    StudentRegistry registry = new StudentRegistry();
    Student prototypeStudent = new Student();
    prototypeStudent.setName("John Doe");
    prototypeStudent.setAge(20);
    prototypeStudent.setPsp(85);
    prototypeStudent.setBatch("2024");
    prototypeStudent.setCourse("Computer Science");

    registry.add("student1", prototypeStudent);
    Student student = registry.get("student1").getClone();
    System.out.println("Name: " + student.getName());
    System.out.println("Age: " + student.getAge());
    System.out.println("PSP: " + student.getPsp());
  }
}
