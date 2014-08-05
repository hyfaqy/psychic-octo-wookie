package com.baldurtech;

public class FizzBuzz {
    public String say(Integer num) {
        if(num == 4) throw new RuntimeException("We don't need 4!");
        if(num % 3 == 0 ) {
            return "Fizz";
        }
        if(num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
}