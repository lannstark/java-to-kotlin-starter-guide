package com.lannstark.lec08

/**
 * 1. 함수 선언 문법
 *   - {} 대신 = 으로 할 수 있다.
 *   - = 일 경우 타입추론으로 인해 함수반환형 생략 가능!
 * 2. default parameter
 *   - 빌더의 @default 어노테이션과 같은!..
 * 3. named argument(parameter)
 *   - 뭔가 typeScript에서 본듯!...
 * 4. 같은 타입의 여러 파라미터 받기 (가변인자)
 *   - ... -> vararg 키워드로 변경 되었고, 변수 명 앞에 써야한다.
 *   - 함수호출 부분에서 배열로 넘길 시 * 연산자를 배열명 앞에 추가해줘야한다!
 */
class lec08 {
}

fun main(){
//    println(max(1,2))
    repeat("Hello Word")

    /**
     * named argument
     * 아래와 같이 함수 선언이 아닌, 호출 부분에서 바로 때려박기도 가능.. ㄷㄷ
     * 빌더를 만들지 않아도, 사용할 수 있는 장.점 이있다.
     * 코틀린에서 자바코드를 가져올때는 namedArgument를 쓸 수 없 ㅠ
     *  -> 그 이유는 자바코드 변환되었을때, 해당 인자의 이름이 없어서 가져 올 수가 없다.
     */
    repeat("Hello Word", useNewLine = false)

    printNameAndGender(name="cc", gender = "ddd")

//    Lec08Main.repeat(name="ddd")
}

fun max(a :Int, b:Int): Int{
    return if (a<b){
        return b
    } else {
        return a
    }
}

/**
 * 이게 된다고?...
 * {} 블록 대신 = 으로 바로 결과반환 가능.. expression의 힘인가 ㄷㄷ..
 */
fun max2(a :Int, b:Int): Int =
    if (a<b){
        b
    } else {
        a
    }

/**
 * a,b 모두 Int이기 때문에, 코틀린은 함수의 반환타입도 추론이 가능하다.
 * 단, = 이아닌 {}을 사용한다면 명시적으로 써줘야함!
 * 그래서 함수 : 타입 생략 간으 ㅋㅋㅋ
 */
fun max3(a :Int, b:Int) = if (a<b){ b } else { a  }

/**
 * 요건 그냥 if-else문 중괄호 생략해서 보여주려고..!>.. 존나 간단하넹
 */
fun max4(a:Int,b:Int) = if(a>b) a else b

/**
 * 함수 선언 부분의 파라미터 선언 부분에서 그냥 = 으로 밖아 주면 됨
 * 물론 자바와 동일하게 오버로딩 기능은 있다!
 */
fun repeat(str :String, num : Int =3, useNewLine : Boolean = true){
    for(i in 1..num){
        if (useNewLine){
            println(str)
        }else {
            print(str)
        }
    }
}

/**
 * named argument
 */
fun printNameAndGender(name: String, gender : String){
    println(name)
    println(gender)
}

/**
 * 가벼인자를 받는 법
 * 키워드 : ... -> vararg로 변경!
 * 또 함수를 호출할때는 파라미터에 , 로 구분지어 넘길때는 같고
 * 배열로 넘길 때는 printAll(*array)와 같은 식으로 * 를 추가해야 한다!
 * * : spread 연산자로, 배열에 있는 원소를 csv처럼 꺼내 쓸수 있게 해주는 연산자
 */
fun printAll(vararg strs: String){
    for(str in strs){
        println(str)
    }
}
