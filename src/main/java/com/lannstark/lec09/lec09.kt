package com.lannstark.lec09

/**
 * 1. 클래스와 프로퍼티
 * 2. 생성자와 init
 * 3. 커스텀 getter, setter
 * 4. backing field
 */
class lec09 {

}

fun main(){
    /**
     * getter와 setter가 이렇게도 쓰일 수 있다.
     */
    val person = Person("te",45)
    println(person.name)
    println(person.age)
    person.age = 10
    println(person.age)
}

/**
 * 클래스 만들기
 * 1. 생성자는 클래스 명 정의 후 써줘야함
 * 1-1. constructor 지시어는 생략 가능하다. -> public class Person (name:String,age:Int){
 * 2. 필드만 만들면 getter,setter가 자동적으로 만들어진다.
 * 3. 생성자 내에서 필드를 만들 수 있다. 취향따라!..
 * 4. getter,setter 호출 시 객체.필드 로 그냥 호출 가능!
 */
public class Person(val name:String,var age:Int){
}