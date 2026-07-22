
public class MethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo1 d1 = new MethodDemo1();
		String name = d1.getData();
		System.out.println(name);
		MethodDemo d2 = new MethodDemo();
		d2.getUserData();
		getData2();

	}

	public String getData() {
		System.out.println("Hello World");
		return "Nayan Lambat";
	}

	public static String getData2() {
		System.out.println("Hello World");
		return "Nayan Lambat";
	}

}
