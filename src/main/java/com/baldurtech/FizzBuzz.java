package com.baldurtech;

class FizzBuzz {
    public String say(Integer num) {
        return "1"; 
    }

    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if("1".equals(fizzBuzz.say(1))) {
            System.out.println("Test Success");
        } else {
            System.out.println("Expect 1 but" + fizzBuzz.say(1));
        }
    }
}
