Dependencies: ANTLR4, Java

1) Compile grammar:
```
antlr4 NGC.g4
```

Remember to add the ANTLR4 library to CLASSPATH
```
export CLASSPATH=".:/path/to/antlr-4.5.3-complete.jar:$CLASSPATH"
```
or add the flag
```
-classpath ".:/path/to/antlr-4.5.3-complete.jar"
```
to the following javac command

2) Compile Java classes:
```
javac NGC*.java
```

3) Execute
```
java NGC2CPP NGC declarationseq inputfile [inputfiles ...]
```
