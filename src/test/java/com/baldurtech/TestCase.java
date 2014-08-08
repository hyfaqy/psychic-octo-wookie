package com.baldurtech;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.reflections.Reflections;

public class TestCase {

    static Boolean testResult = true;
     
    public static void main(String args[]) {
        
        String testPackage = "com.baldurtech";
        
        Reflections reflections = new Reflections(testPackage);
        
        Set<Class<? extends TestCase>> allTestCase = reflections.getSubTypesOf(TestCase.class);
        
        for(Class clazz: allTestCase) {
            System.out.println("Testing: " + clazz.getName());
            runAllTests(clazz);
        }
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