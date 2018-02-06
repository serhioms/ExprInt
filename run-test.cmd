@echo off
echo main start
java -version
java -cp target/test-classes;target/classes;target/exprint-jar-with-dependencies.jar org.junit.runner.JUnitCore org.antlr.test.TestCalc
java -cp target/test-classes;target/classes;target/exprint-jar-with-dependencies.jar org.junit.runner.JUnitCore org.antlr.test.TestSets
java -cp target/test-classes;target/classes;target/exprint-jar-with-dependencies.jar org.antlr.test.TestSets
java -cp target/test-classes;target/classes;target/exprint-jar-with-dependencies.jar org.antlr.test.TestCalc
java -cp target/test-classes;target/classes;target/exprint-jar-with-dependencies.jar org.antlr.test.TestHello
