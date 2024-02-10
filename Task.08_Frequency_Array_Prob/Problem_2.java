import java.util.Scanner;

public class Problem_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String inputText = input.next();
    int[] freqArray = new int[26];

    for (int i = 0; i < inputText.length(); i++) {
      freqArray[inputText.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
      if (freqArray[i] != 0)
        System.out.println((char) (i + 'a') + " : " + freqArray[i]);

    }
  }
}
