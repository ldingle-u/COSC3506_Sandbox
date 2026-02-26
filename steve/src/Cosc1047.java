import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Cosc1047 {

	public static void main(String[] args) {
		String[] array1 = {"r", "g", "b"};
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array1));
		
		System.out.println("min " + Collections.min(list));
		System.out.println("max " + Collections.max(list));

		Integer[] array2 = {2,73,42,45,23,56};
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
		System.out.println(list2);
		Collections.shuffle(list2);
		System.out.println(list2);
		
		System.out.println("binary zort is" + Collections.binarySearch(list2,56));
		System.out.println( list2);
		
		
	}

}
