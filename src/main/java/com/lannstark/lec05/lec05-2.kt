package com.lannstark.lec05

fun getGradeWithSwitch(score: Int) : String{
    return when(score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any) : Boolean{
    return when ( obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}


fun judgeNumber(number : Int){
    when(number){
        1,0,-1 -> println("d어디서 많이 본 숫자 입니다.");
        else -> println("-1, 0, 1 이 아닙니다.")
    }
}

fun judgeNumber2(number2 : Int){
    when{
        number2 == 0 -> print("주어진 숫자는 0입니다.")
        number2 % 2 == 0 -> println("주어진 숫자는 짝수 입니다.")
        else -> println("w주어진 숫자는 홀수 입니다.")
    }
}
class `lec05-2` {
}