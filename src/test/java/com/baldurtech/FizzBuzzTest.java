package com.baldurtech;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    
    static Boolean testResult = true;
    
    public static void main(String args[]) {
        runAllTests(FizzBuzzTest.class);
        testReport();
    }
    
    private static void runAllTests(Class clazz) {
        for(Method method: getAllTestMethods(clazz)) {
            System.out.println("testing: " + method.getName());
            try {
                Object obj = clazz.newInstance();
                method.invoke(obj, new Object[]{});  
            } catch(Exception e) {
                testResult = false;
                System.out.println("Unexpected exception!");
                e.printStackTrace();
            }
        }
    }
    
    private static List<Method> getAllTestMethods(Class clazz) {
        List<Method> testMethods = new ArrayList<Method>();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method: methods) {
            if(method.getName().startsWith("test")) {
                testMethods.add(method);
            }
        }
       return testMethods;
    }
    
    public static void testReport() {
        if(testResult) {
            System.out.println("Test Success");
        } else {
            System.out.println("Test Failed");
        }
    }
    
    public static void assertEquals(String expectedResult, String actualResult) {
            if(expectedResult.equals(actualResult) == false) {
                testResult = false;
                System.out.println("Expected: " + expectedResult + ", but:" + actualResult);
            }
    }
    
    public void test1_should_be_1() {
        assertEquals("1", fizzBuzz.say(1));
    }
        
    public void test2_should_be_2() {
        assertEquals("2", fizzBuzz.say(2));
    }
    public void test3_should_be_Fizz() {
        assertEquals("Fizz", fizzBuzz.say(3));
    }
        
    public void test6_shuold_be_Fizz() {
        assertEquals("Fizz", fizzBuzz.say(6));
    }
    
    public void test5_should_be_Buzz() {
        assertEquals("Buzz", fizzBuzz.say(5));
    }
    
    public void test4_should_be_4() {
        assertEquals("4", fizzBuzz.say(4));
    }
    
    
        
}