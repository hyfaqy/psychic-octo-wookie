package com.baldurtech;

public class FizzBuzzTest extends TestCase {

    FizzBuzz fizzBuzz = new FizzBuzz();
    
    public void test1_should_be_1() {
        assertEquals("1", fizzBuzz.say(1));
    }
        
    public void test2_should_be_2() {
        assertEquals("2", fizzBuzz.say(2));
    }
    public void test3_should_be_Fizz() {
        assertEquals("Fizz", fizzBuzz.say(3));
    }
        
    public void test6_shuold_be_Fizz() {
        assertEquals("Fizz", fizzBuzz.say(6));
    }
    
    public void test5_should_be_Buzz() {
        assertEquals("Buzz", fizzBuzz.say(5));
    }
    
    public void test4_should_be_4() {
        assertEquals("4", fizzBuzz.say(4));
    }
    
    
        
}