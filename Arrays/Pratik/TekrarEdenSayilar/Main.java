package Pratik.TekrarEdenSayilar;

public class Main {

	static boolean isRepeat(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] numbers = { 4, 7, 4, 7, 2, 8, 10, 21, 8, 9, 9, 10 };
		int[] duplicate = new int[numbers.length];

		int startIndex = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if ((i != j) && numbers[i] == numbers[j]) {
					if (!isRepeat(duplicate, numbers[i])) {
						duplicate[startIndex++] = numbers[i];
					}
					break;
				}
			}
		}

		for (int value : duplicate) {
			if (value != 0 && value % 2 == 0) {
				System.out.print(value + " ");
			}
		}
		

		/*
		 * 
		 * int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
		 * 
		 * Set<Integer> notDuplicate = new HashSet<>();
		 * 
		 * for(int number : list) { notDuplicate.add(number); }
		 * 
		 * List<Integer> sortedNotDuplicate = new ArrayList<>(notDuplicate);
		 * Collections.sort(sortedNotDuplicate);
		 * 
		 * for(int numb : sortedNotDuplicate) { System.out.print(numb + " "); }
		 */

	}

}
