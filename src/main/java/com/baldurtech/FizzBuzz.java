package com.baldurtech;

public class FizzBuzz {

    public String say(Integer num) {
        if(num % 3 == 0 ) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
    
    static Boolean testResult = true;
    
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.assertEquals("1", fizzBuzz.say(1));
        fizzBuzz.assertEquals("Fizz", fizzBuzz.say(3));
        fizzBuzz.assertEquals("Fizz", fizzBuzz.say(6));
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