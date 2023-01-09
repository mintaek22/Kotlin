fun main() {

    /**변수선언*/

    //(value)불변 자바의 final
    val a = 1

    //(variable)가변
    var b = "안녕"

    //변수선언만 할 경우 타입을 넣어주어야 한다(할당까지 하면 자동으로 자료형 잡아줌)
    var c:String

    //변수 프린트는 $ 사용
    println("a : $a")

    /**조건문*/
    val d = 3
    if (d.equals(3)){
        println("good")
    }

    val data = 10
    val result=if (data>10){
        println("data>10")
        13
    }else{
        println("data<10")
        12
    }
    println("result: $result")

    val data2=10
    when (data2){
        10 -> println("data is 10")
        20 -> println("data is 20")
        in 30..40 -> println("data is 30 to 40")
        else -> {
            println("data is not valid data")
        }
    }

    /**반복문*/

    for (i in 1..3){
        println(i)
    }

    for (i in 1..6 step 2){
        println(i)
    }

    for(i in 6 downTo 0){
        println(i)
    }

    val arr = arrayOf("one","two","three")
    for(i in arr){
        println(i)
    }



    /**기본 배열 <init>(size: Int) 초기값
    자료형 생략 가능*/

    val arr1: Array<Int> = Array(3) { 0 }
    arr1[1] = 1
    println(arr1[1])
    println(arr1.size)

    /**collection도 MutableCollection<T>와 Collection<T>로 나눔
    collection도 자료형 생략가능*/

    //불변
    val Alist: List<Int> = listOf(1,2,3)

    //가변
    val Blist: MutableList<Int> = mutableListOf(1,2,3)
    Blist.add(4)
    println(Blist)

    //자료형 생략
    val CList = listOf(1,2,3)

    val AMap: MutableMap<String,Int> = mutableMapOf(Pair("one", 1),"two" to 2)
    AMap.put("three",3)
    println(AMap)



}


/**함수 fun 함수명(매개변수명: 타입): 반환타입 { }*/
fun fun1(): Unit {}
fun fun2(x: Int) = x*2