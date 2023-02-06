package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

/**
 * 1. try catch finally : 문법이 완전 동일하다! 단, expression이라 더 유연한 작성이 가능하다!
 * 2. checked, unchecked : 코틀린에서는 모두 Unchecked Exception이다. 왜지?..
 * 3. try with resources : 해당 구문이 없다! 대신 use라는 인라인 함수를 사용한다!
 */
fun main(){
//    println(parseIntForThrow("  ") )
    readFile()
}
fun parseIntForThrow(str: String): Int{
    try{
        return str.toInt()
    }catch (e: NumberFormatException){
    throw IllegalArgumentException("숫자가 아닙니다.")
    }
}

/**
 * try-catch도 expression이다!
 */
fun parseIntForThrow2(str: String): Int?{
    return try{
        str.toInt()
    }catch (e: NumberFormatException){
        null
    }
}

/**
 * unchecked exception으로 취급하는데... 뭐 편하긴 한데, 왜 일까?
 */
fun readFile( ){
 val currentFile = File(".")
    val file = File(currentFile.absolutePath+ "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

/**
 * 코틀린에서는 try-with-Resouces 구문이 없다!
 * z코틀린의 특성을 이용해 만들어진 함수!.. 이걸 알아야 한담.
 */
fun readFileWithResources(path : String){
    BufferedReader(FileReader(path)).use {
        reader -> println(reader.readLine())
    }
}


class lec07 {
}