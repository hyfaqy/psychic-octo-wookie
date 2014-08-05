package com.baldurtech;
 
public class FizzBuzzTest {
 
    static Boolean testResult = true;
    
    public static void main(String args[]) {
        
        new FizzBuzzTest().test1_should_be_1();
        new FizzBuzzTest().test2_should_be_2();
        new FizzBuzzTest().test3_should_be_Fizz();
        new FizzBuzzTest().test6_shuold_be_Fizz();
        new FizzBuzzTest().test5_should_be_Buzz();
        testReport();
    }
    
    public static void assertEquals(String expectedResult, String actualResult) {
            if(expectedResult.equals(actualResult) == false) {
                testResult = false;
                System.out.println("Expeccted Result : " + expectedResult + ", but Actual Result:" + actualResult);
            }
    }
    
    public static void testReport() {
        if(testResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test Failed");
        }
    }
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
        
}