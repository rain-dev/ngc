Dependencies: ANTLR4, Java

1) Compile grammar:
```
antlr4 NGC.g4
```

2) Compile Java classes:
```
javac NGC*.java
```

3) Execute
```
java NGC2CPP NGC declarationseq inputfile [inputfiles ...]
```
