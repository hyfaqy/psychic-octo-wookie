package com.baldurtech;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class TestCase {

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
}