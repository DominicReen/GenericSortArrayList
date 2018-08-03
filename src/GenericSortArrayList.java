import java.util.Scanner;
import java.util.ArrayList;

public class GenericSortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in); // create scanner
		System.out.println("Enter 10 numbers, separated by a space:");
		
		for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
		
		sort(list); // call method to sort list
		
		System.out.println(list); // print out list

	}
	
	// this method is almost exactly like the one on page 745 of the textbook, but I'm using an ArrayList instead of an array.
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;
		
		for (int i = 0; i < list.size() - 1; i++) {
			// Find the smallest number in the list
			currentMin = list.get(i);
			currentMinIndex = i;
			
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin.compareTo(list.get(j)) > 0) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			
			// Swap list.get(j) with list.get(currentMinIndex) if necessary
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
			
		}

	}
	
}
