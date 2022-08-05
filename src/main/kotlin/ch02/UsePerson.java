package ch02;

public class UsePerson {

  public static void main(String[] args) {
    Person person = new Person("Bob", true);
    System.out.println("person.getName() = " + person.getName());
    System.out.println("person.isMarried() = " + person.isMarried());

  }
}
