
public class SumTest {
	public static void main(String[] args) {
		int count = 0;
		int total =0;
		while (count <= 1000) {
			total += count;
			count++;
		}
		System.out.println(total);
	}
}
