package com.baldurtech;
 
public class FizzBuzzTest {
 
    static Boolean testResult = true;
    
    public static void main(String args[]) {
        
        test1();
        test2();
        test3();
        test4();
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
    
    public static void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.say(1));
    }
        
    public static void test2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.say(2));
    }
    public static void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.say(3));
    }
        
    public static void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.say(6));
    }
        
}