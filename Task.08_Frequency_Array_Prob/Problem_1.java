import java.util.Scanner;

public class Problem_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int size = input.nextInt();
    int maxNum = input.nextInt();

    int[] array = new int[size];
    int[] freqArray = new int[maxNum + 1];

    for (int i = 0; i < size; i++) {
      array[i] = input.nextInt();
      freqArray[array[i]]++;
    }

    for (int i = 0; i < maxNum + 1; i++) {
      if (freqArray[i] != 0)
        System.out.println(freqArray[i]);

    }
  }
}
