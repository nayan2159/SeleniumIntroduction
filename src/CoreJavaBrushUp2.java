import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122 };

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {

				System.out.println(arr2[i]);
				break;

			} else {
				System.out.println(arr2[i] + "Is not multiple of 2");
			}

		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Nayan");
		a.add("Lambat");
		a.add("Academy");
		a.add("Selenium");

		/*
		 * System.out.println(a.get(0)); System.out.println(a.get(1));
		 * System.out.println(a.get(2)); System.out.println(a.get(3));
		 * 
		 * System.out.println(a.contains("Academy"));
		 */

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("********");

		for (String v : a) {
			System.out.println(v);
		}
		
        String[] name= {"Nayan","Lambat","academy"};
        List<String> nameArray=Arrays.asList(name);
        System.out.println(nameArray.contains("academy"));


	}

}
