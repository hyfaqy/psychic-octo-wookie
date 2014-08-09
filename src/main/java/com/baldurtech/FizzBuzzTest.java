package com.baldurtech;

public class FizzBuzzTest {
    static boolean testResult = false;
        
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
        assertEquals("Fizz", fizzBuzz.say(3));
        
        outputTestReport(testResult);
    }
    
    public static void outputTestReport(boolean testResult) {
        if(testResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test False");
        }
    }
    
    public static void assertEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            testResult = true;
        } else {
            testResult = false;
            System.out.println("Expected" + expectedResult + "but" + actualResult);
        }
    }  
}