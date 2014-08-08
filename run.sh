#!/bin/sh

CLASSPATH="lib/reflections-0.9.9-RC2.jar;target/classes;target/test-classes"
CLASSPATH="$CLASSPATH;lib/guava-15.0.jar"
CLASSPATH="$CLASSPATH;lib/javassist-3.18.2-GA.jar"

java -classpath "$CLASSPATH" com.baldurtech.TestCase 
