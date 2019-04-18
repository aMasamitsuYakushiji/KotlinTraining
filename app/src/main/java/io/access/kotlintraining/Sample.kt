package io.access.kotlintraining

import java.util.Random

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function

fun hello() {
    println("Hello World!")
}


fun FB2(num: Int): String {
    var st: String = ""
    when {
        num % 15 == 0 -> st = "FizzBuzz"
        num % 3 == 0 -> st = "Fizz"
        num % 5 == 0 -> st = "Buzz"
        else -> st = Integer.toString(num)
    }
    return st
}


fun FizzBuzz(min: Int, max: Int) {
    for (i in min..max) {
        var check = true
        if (i % 3 == 0) {
            print("Fizz")
            check = false
        }
        if (i % 5 == 0) {
            print("Buzz")
            check = false
        }
        if (check == true) {
            print(i)
        }
        println()

    }
}


fun isLeapYear(y: Int): Boolean {
    when {
        y % 400 == 0 -> return true
        y % 100 == 0 -> return false
        y % 4 == 0 -> return true
        else -> return false
    }
}

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }

    var ans: Long = 1
    for (i in 1..n) {
        ans *= a
    }
    return ans
}

fun Int.isOdd() = this % 2 != 0
fun Int.isEven() = this % 2 == 0

class Dice(sur: Int) {
    val surface = sur
    var durability = 5
    var i = 0
    val random=Random()
    fun roll():Int {
        if (this.durability <= 0) {
            throw Exception("I was broken")
        } else {
            this.durability--
            i = random.nextInt(this.surface) + 1
            return i
        }
    }

}

class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
        get() = this.propertyWithCounter
        set(value){
            this.counter++
            field= value
        }


}

class NabeAtsu() {
    var counter=0
    var st=""
    fun next(): String{
        this.counter++
        if (this.counter%3==0){return("aho")}
        st=Integer.toString(counter)
        st.forEach{
            if(it=='3'){return("aho")}
        }
        return st
    }
}


fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    // TODO: 実装する
    //client,messageはnullの可能性
    client ?: return
    message ?: return
    //mailerはnullではない
    //nullが見えたらreturn
    val personalInfo=client.personalInfo ?: return
    //personalInfoクラスからPインスタンス生成しClientからgetPersonalInfoして投げる
    //文字列emailにPインスタンスからgetEmailして代入
    //mailer.sendMessage(email, message)をやる
}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}