# GeneralFunctions Class for Common Project Methods

## Overview

In response to a request from a team leader, the `GeneralFunctions` class has been developed to provide essential methods for a project. The methods are designed to be used without revealing the underlying code, emphasizing clear and intuitive method names. Below is an overview of the methods included in the class:

### [reverseInteger](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Generics/src/Generics/GeneralFunctions.java)

- Method Signature: `public static int reverseInteger(int number)`
- Description: Reverses the order of digits in an integer.
- Example: `reverseInteger(3456)` returns `6543`.

### [randomInteger (Single Argument)](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Generics/src/Generics/GeneralFunctions.java)

- Method Signature: `public static int randomInteger(int maxValue)` 
- Description: Generates a random integer from 0 to the specified maximum value (inclusive).
- Example: `randomInteger(10)` returns a random value between 0 and 10.

### [randomInteger (Two Arguments)](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Generics/src/Generics/GeneralFunctions.java)

- Method Signature: `public static int randomInteger(int minValue, int maxValue)`
- Description: Generates a random integer within the specified range (inclusive).
- Example: `randomInteger(5, 10)` returns a random value between 5 and 10.

### [randomCharacter](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Generics/src/Generics/GeneralFunctions.java)

- Method Signature: `public static char randomCharacter()`
- Description: Generates a random character, either uppercase or lowercase.
- Example: `randomCharacter()` returns a random letter 'A' to 'Z' or 'a' to 'z'.

### [printArray](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Generics/src/Generics/GeneralFunctions.java)

- Method Signature: `public static <T> void printArray(T[] array)`
- Description: Prints the elements of an array of any type.
- Example: `printArray(new Integer[]{1, 2, 3})` prints "1 2 3".

## Notes

- The class uses `Math.random()` to generate random values.
- For inclusive random integer ranges, adjustments are made using `(int) (Math.random() * n)` where `n` is the range size.

The `GeneralFunctions` class is ready for use, providing a concise and easy-to-understand set of methods for common project requirements.

## Additional Resources

- [Task Information PDF](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Task2.pdf)
- [GeneralFunctions Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Generics/src/Generics/GeneralFunctions.java)
- [Main Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.02_Generics/Generics/src/Generics/Main.java)
