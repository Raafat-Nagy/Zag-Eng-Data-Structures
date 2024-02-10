import java.util.Scanner;

public class Problem_3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String inputText = input.next();
    int[] freqArray = new int[26];

    for (int i = 0; i < inputText.length(); i++) {
      freqArray[inputText.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
      if (freqArray[i] != 0)
        for (int j = 0; j < freqArray[i]; j++) {
          System.out.print((char) (i + 'a'));
        }

    }
  }
}
