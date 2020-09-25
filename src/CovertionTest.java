
public class CovertionTest {
	public static void main(String[] args) {
		double salary = 1270.50;
		int value = (int)salary;
		System.out.println(value);
		
		float smallFloat = 3.14f;
		long bigNumber = 313131313113131l;
		short smallNumber = 2131;
		byte b = 127;
		
		// Normal error
		double value1 = 0.2;
		double value2 = 0.1;
		double total = value1 + value2;
		System.out.println(total);
	}

}
