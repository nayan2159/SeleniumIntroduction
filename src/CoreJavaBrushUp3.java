
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {

		//String is an OBject in java
		String s="Nayan Lambat Academy";
		String s1="Nayan Lambat Academy";
		
		//Define String with new Operator
		String s2=new String("Nayan");
		String s3=new String("Nayan");
		
		String name="Nayan Lambat Academy";
		String[] splittedString=name.split("Lambat");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i=name.length()-1;i>0;i--) {
			
			System.out.println(name.charAt(i));
		}



		
		
	}

}
