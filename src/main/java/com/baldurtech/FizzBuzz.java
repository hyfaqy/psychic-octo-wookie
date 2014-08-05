package com.baldurtech;

public class FizzBuzz {

    public String say(Integer num) {
        if(num == 3) {
            return "Fizz";
        }
        return String.valueOf(num);
    }
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.say(1));
        System.out.println(fizzBuzz.say(3));
    }
}