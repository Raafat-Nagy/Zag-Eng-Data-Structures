package Generics;

public class GeneralFunctions {
    /* Write method that (return an integer reversed) ,
       the method receive an integer, and it should return it in reverse order,
       For example, reverse(3456) return 6543   */
    public static int reverseInteger(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    /* Method receive a value and return a random int value
       from 0 to this value , for example if I send 10 it should
       return random value like 0 or 1 or 2 or 3 …… or 9 or 10 */
    public static int randomInteger(int maxValue) {
        return (int) ((maxValue + 1) * Math.random());
    }

    /* Method receive two values min and max and return a
       random int value from min to this max ,
       for example if I send 5 and 10 it should return random value
       like 5 or 6 or 7 or 8 or 9 or 10 */
    public static int randomInteger(int minValue, int maxValue) {
        return (int) (minValue + ((maxValue - minValue + 1) * Math.random()));
    }

    // Method return random character.
    public static char randomCharacter() {
        return (char) (randomInteger(0, 1) == 1 ? randomInteger('A', 'Z') : randomInteger('a', 'z'));
    }


    // Method receive array of any type, and it should print it.
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}