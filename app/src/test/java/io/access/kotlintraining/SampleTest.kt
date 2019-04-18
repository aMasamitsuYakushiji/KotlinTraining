package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals


class SampleTest {
    //@Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    //@Test
    fun testHello() {
        // TODO: implement to call hello function
        hello()
    }

    //@Test
    fun testFizzBuzz() {
        FizzBuzz(1, 100)
    }

    //@Test
    fun testFizzBuzz2() {
        var j = ""
        for (i in 1..100) {
            j = FB2(i)
            println(j)
        }
    }

    //@Test
    fun FizEQ() {
        assertEquals(FB2(15), "FizzBuzz")
        //assertEquals(FB2(16),"FizzBuzz")
        //assertEquals(FB2(18),"FizzBuzz")
    }

    //@Test
    fun PowEQ() {
        assertEquals(power(2, 3), 8)
        assertEquals(power(2, 0), 1)
        assertEquals(power(4, 2), 16)
    }

    //@Test
    fun isTest() {
        val a = 5
        println(a)
        println(a.isOdd())  // true
        println(a.isEven()) // false
    }

    //@Test
    fun DiceTest() {
        val ten = Dice(10)
        for (i in 1..3) {
            println(ten.roll())
        }
    }

    //@Test
    fun settest() {
        val p = MyCustomClass()
        p.propertyWithCounter = 123
        p.propertyWithCounter = 456
        p.propertyWithCounter = 789
        println(p.counter) // 3
    }

    @Test
    fun nabetest(){
        val n = NabeAtsu()
        for (i in 1..100) {
            println(n.next())
        }
    }


}