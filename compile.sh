#!/bin/sh
javac -d target/classes/ src/main/java/com/baldurtech/*.java 
javac -d target/test-classes/ -classpath target/classes/ src/test/java/com/baldurtech/*.java
