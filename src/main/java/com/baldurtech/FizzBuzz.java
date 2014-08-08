package com.baldurtech;

class FizzBuzz {
    static boolean testResult = false;
    public String say(Integer num) {
        return String.valueOf(num);
    }

    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        testResult = assertEquals("1", fizzBuzz.say(1));
        testResult = assertEquals("2", fizzBuzz.say(2));
        
        if(testResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test False");
        }
    }
    
    public static boolean assertEquals(String expectedResult, String actualResult) {
        if(expectedResult.equals(actualResult)) {
            testResult = true;
        } else {
            System.out.println("Expected" + expectedResult + "but" + actualResult);
        }
        return testResult;
    }  
}
