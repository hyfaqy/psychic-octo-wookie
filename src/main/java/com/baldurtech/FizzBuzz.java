package com.baldurtech;

class FizzBuzz {
    public String say(Integer num) {
        return String.valueOf(num);
    }

    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        boolean testResult = false;
        
        if("1".equals(fizzBuzz.say(1)) != false) {
            testResult = true;
        } else {
            System.out.println("Expected 1 but" + fizzBuzz.say(1));
        }
        
        if("2".equals(fizzBuzz.say(2)) != false) {
            testResult = true;
        } else {
            System.out.println("Expected 2 but" + fizzBuzz.say(2));
        }
        
        if(testResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test False");
        }
    }
}
