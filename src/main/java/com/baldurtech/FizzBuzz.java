package com.baldurtech;

public class FizzBuzz {

    public String say(Integer num) {
        if(num == 3) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
    
    static Boolean testResult = true;
    
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(1);
        
        if("1".equals(actualResult) == false) {
            testResult = false;
            System.out.println("Expeccted Result : 1, but Actual Result:" + actualResult);
        }
        
        actualResult = fizzBuzz.say(3);
        
        if("Fizz".equals(actualResult) == false) {
            testResult = false;
            System.out.println("Expeccted Result : Fizz , but Actual Result:" + actualResult);
        }
        
        if(testResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test Failed");
        }
    }
}