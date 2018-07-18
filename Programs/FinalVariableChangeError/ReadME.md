# Final Variable Properties
* Final Variables are known as constants.
* It is declared with keyword `final`.
* It can be initilized only once.

## Syntax

`final datatype variablename = value;`

## Example

`final int a = 10;`

## Program
```java
import java.io.*;
class Main{
	public static void main(String[] args){
	//final variable  
	final int a = 10;
	System.out.println("Value of Final Variable a is "+a);
	//Attempting to change value of final variable
	a=20;
	}
}
```

## Output
```console
Microsoft Windows [Version 10.0.17134.165]
(c) 2018 Microsoft Corporation. All rights reserved.

E:\Acadamics\CS8382-OOPS\Programs\FinalVariableChangeError>javac Main.java
Main.java:9: error: cannot assign a value to final variable a
        a=20;
        ^
1 error

E:\Acadamics\CS8382-OOPS\Programs\FinalVariableChangeError>
```
