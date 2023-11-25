package Generics;

public class Main {
    public static void main(String[] args) {
        // Test reverseInteger
        int originalNumber = 3456;
        int reversedNumber = GeneralFunctions.reverseInteger(originalNumber);
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println();

        // Test randomInteger with maxValue
        int maxValue = 10;
        int randomValue = GeneralFunctions.randomInteger(maxValue);
        System.out.println("Random Integer (0 to " + maxValue + "): " + randomValue);
        System.out.println();

        // Test randomInteger with minValue and maxValue
        int minValue = 5;
        int randomRangeValue = GeneralFunctions.randomInteger(minValue, maxValue);
        System.out.println("Random Integer (" + minValue + " to " + maxValue + "): " + randomRangeValue);
        System.out.println();

        // Test randomCharacter
        char randomChar = GeneralFunctions.randomCharacter();
        System.out.println("Random Character: " + randomChar);
        System.out.println();

        // Test printArray
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        GeneralFunctions.printArray(intArray);
        Character[] charArray = {'a', 'b', 'c', 'd'};
        System.out.println("Character Array:");
        GeneralFunctions.printArray(charArray);
    }
}