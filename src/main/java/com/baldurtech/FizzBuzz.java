package com.baldurtech;

class FizzBuzz {
    static boolean testResult = false;
    
    public String say(Integer num) {
        if(num%3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }

    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        testResult = assertEquals("1", fizzBuzz.say(1));
        testResult = assertEquals("2", fizzBuzz.say(2));
        testResult = assertEquals("Fizz", fizzBuzz.say(3));
        
        outputTestReport(testResult);
    }
    
    public static void outputTestReport(boolean testResult) {
        if(testResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test False");
        }
    }
    public static boolean assertEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            testResult = true;
            return testResult;
        } else {
            testResult = false;
            System.out.println("Expected" + expectedResult + "but" + actualResult);
            return testResult;
        }
    }  
}
