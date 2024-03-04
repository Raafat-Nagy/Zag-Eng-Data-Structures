import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Array Size: ");
		int size = scanner.nextInt();

		int[] arrray = new int[size];

		System.out.print("Enter Values:");

		for (int i = 0; i < size; i++) {
			arrray[i] = scanner.nextInt();
		}

		System.out.print("Most Repeated Element: " + mostRepeatedElement(arrray));

	}

	public static int mostRepeatedElement(int[] arrray) {
		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int num : arrray) {
			int value = hashMap.containsKey(num) ? hashMap.get(num) : 0;
			hashMap.put(num, value + 1);
		}

		int max = hashMap.get(arrray[0]);
		int mostRepeatedElement = arrray[0];

		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				mostRepeatedElement = entry.getKey();
			}
		}

		return mostRepeatedElement;
	}

}