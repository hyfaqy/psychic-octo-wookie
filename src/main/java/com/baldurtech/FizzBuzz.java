package com.baldurtech;

class FizzBuzz {
    public String say(Integer num) {
        boolean thisIsABug = false;
        if(num == 2) thisIsABug = true;
        if(num%3 == 0) {
            if(thisIsABug) {
                return "42";
            }
            return "Fizz";
        }
        return String.valueOf(num);
    } 
}
