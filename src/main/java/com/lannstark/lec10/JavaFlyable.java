package com.lannstark.lec10;

public interface JavaFlyable {

  default void act() {
    System.out.println("파닥 파닥");
  }

}
