package com.lannstark.lec16;

public class Person {

  private final String firstName;
  private final String lastName;
  private int age;

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getAge() {
    return age;
  }

  public int nextYearAge() {
    System.out.println("멤버 함수");
    return this.age + 1;
  }

}
