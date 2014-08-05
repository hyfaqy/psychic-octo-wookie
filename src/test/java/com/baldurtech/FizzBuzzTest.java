package com.baldurtech;
 
public class FizzBuzzTest {
 
    static Boolean testResult = true;
        
    public static void main(String args[]) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzzTest.assertEquals("1", fizzBuzz.say(1));
        FizzBuzz fizzBuzz2 = new FizzBuzz();
        fizzBuzzTest.assertEquals("2", fizzBuzz2.say(2));
        FizzBuzz fizzBuzz3 = new FizzBuzz();
        fizzBuzzTest.assertEquals("Fizz", fizzBuzz3.say(3));
        FizzBuzz fizzBuzz4 = new FizzBuzz();
        fizzBuzzTest.assertEquals("Fizz", fizzBuzz4.say(6));
        testReport();
    }
    
    public void assertEquals(String expectedResult, String actualResult) {
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
}